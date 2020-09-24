package com.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.training.dao.DummyDao;
import com.training.dao.MySQLDao;

@Configuration
public class AppConfig1 {

	public AppConfig1() {
			System.out.println("AppConfig1 Instantiated... ");
	}
	
	// 2 scopes (singleton, prototype)
	// by default spring initialized 
	// as singleton 
	@Lazy
	@Bean
	@Scope("singleton")
	public DummyDao dummyDao() {
		return new DummyDao(); 
	}
	
	@Lazy
	@Bean
	public MySQLDao mysqlDao() {
		return new MySQLDao(); 
	}
}
