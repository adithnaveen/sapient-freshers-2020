package com.training.abs.impl;

import com.training.abs.contracts.IProductDao;

public class JdbcProductDao implements IProductDao {

	@Override
	public void save() {
		System.out.println("Jdbc - Save");
	}

	@Override
	public void delete() {
		System.out.println("jdbc - Delete..");
	}

}
