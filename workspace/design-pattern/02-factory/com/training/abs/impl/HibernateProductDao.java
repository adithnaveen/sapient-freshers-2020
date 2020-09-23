package com.training.abs.impl;

import com.training.abs.contracts.IProductDao;

public class HibernateProductDao implements IProductDao {

	@Override
	public void save() {
		System.out.println("Hibernate - Save");
	}

	@Override
	public void delete() {
		System.out.println("Hibernate - Deleting");
	}

}
