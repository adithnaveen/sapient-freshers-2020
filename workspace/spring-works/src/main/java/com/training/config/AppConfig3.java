package com.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.training.dao.DummyDao;
import com.training.dao.MySQLDao;

// to load mysql and aspect 

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = {"com.training.aspect"})
public class AppConfig3 {

	@Bean
	public MySQLDao mysqlDao() {
		return new MySQLDao(); 
	}
	
	@Bean
	public DummyDao dummyDao() {
		return new DummyDao(); 
	}
}
