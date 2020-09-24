package com.training.dao;

import org.springframework.stereotype.Component;

@Component
public class MySQLDao implements IDatabase {
	public MySQLDao() {
		System.out.println("MySQLDao - Constructed... ");
	}

	public int getCount() {
		System.out.println("i'm in count..... ");

		return 100;
	}
}
