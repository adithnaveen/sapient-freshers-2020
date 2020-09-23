package com.training.abs.factory;

import java.util.ResourceBundle;

import com.training.abs.contracts.IProductDao;
import com.training.abs.impl.HibernateProductDao;
import com.training.abs.impl.JdbcProductDao;
import com.training.abs.impl.MongoProductDao;

// no body to create an object of this class 
public final class DaoFactory {
	// resource intensive
	// should give me hibernate, mongo, jdbc impl
	// based on the input got from application.properties
	private DaoFactory() {
	}

	public static IProductDao getProductsDao() {
		ResourceBundle rb = ResourceBundle.getBundle("application");
		String dbSelect = rb.getString("daoService.impl");
		return getProductDao(dbSelect);
	}

	private static IProductDao getProductDao(String dbSelect) {
		System.out.println("DB Selected is " + dbSelect);

		switch (dbSelect.toLowerCase()) {
		case "mongo":
				return new MongoProductDao(); 
		case "hibernate":
				return new HibernateProductDao(); 
		case "jdbc":
				return new JdbcProductDao(); 

		default:
			throw new RuntimeException("Sorry not supported DB listed " + dbSelect);
		}

	}
}
