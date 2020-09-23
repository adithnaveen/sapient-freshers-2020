package com.training.abs.client;

import com.training.abs.contracts.IProductDao;
import com.training.abs.factory.DaoFactory;

public class FactoryClient {
	public static void main(String[] args) {
		IProductDao dao = DaoFactory.getProductsDao(); 
		
		dao.save(); 
		dao.delete(); 
	}
}
