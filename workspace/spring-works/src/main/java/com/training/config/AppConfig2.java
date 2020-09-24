package com.training.config;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class AppConfig2 {
	@Value("${jdbc.driver}")
	private String driverClass; 
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String userName;
	
	@Value("${jdbc.password}")
	private String password;
	
	@Bean
	public Connection getConnection() {
		System.out.println("Drive>r -> " + this.driverClass);
		System.out.println("URL -> "+ this.url);
		System.out.println("User Name -> " + this.userName);
		System.out.println("Password -> " + this.password);
		return null; 
	}
	
	
}
