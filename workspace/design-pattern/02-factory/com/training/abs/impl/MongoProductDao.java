package com.training.abs.impl;

import com.training.abs.contracts.IProductDao;

public class MongoProductDao implements IProductDao {

	@Override
	public void save() {
		System.out.println("Mongo - Save");
	}

	@Override
	public void delete() {
		System.out.println("Mongo - Delete");
	}

}
