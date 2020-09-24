package com.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.dao.DummyDao;
import com.training.dao.MySQLDao;

@Configuration
public class AppConfig1 {

	public AppConfig1() {
			System.out.println("AppConfig1 Instantiated... ");
	}
	
	@Bean
	public DummyDao dummyDao() {
		return new DummyDao(); 
	}
	
	@Bean
	public MySQLDao mysqlDao() {
		return new MySQLDao(); 
	}
}
