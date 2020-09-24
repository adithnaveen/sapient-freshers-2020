package com.training.dao;

public class DummyDao implements IDatabase {
	public DummyDao() {
		System.out.println("DummyDao - Constructor... ");
	}
	
	public int getCount() {
		return 0; 
	}
}
