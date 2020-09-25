package com.training.springbootworks.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.training.springbootworks.beans.Address;
import com.training.springbootworks.beans.User;
import com.training.springbootworks.repo.UserRepository;

@Configuration
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class MongoConfig {
// to put some data to db 
	
	@Bean
	public CommandLineRunner commandLineRunner(UserRepository userRepository) {
		System.out.println("in the insert ->MongoConfig.commandLineRunner ");
		return string  -> {
//			userRepository.insert(new User(101, "Uday", 22, "uday@ps.com", 
//					new Address(12, "Halter Ln", "Reston", "VA", 27017) )); 
//			
//			userRepository.insert(new User(102, "Suresh", 23, "sures@ps.com", 
//					new Address(55, "SteversCreek Blvd", "Cupertino", "CA", 36078) ));
//			
//			userRepository.insert(new User(103, "Pranavika", 21, "pranavika@ps.com", 
//					new Address(34, "American Dremway", "Ashburn", "VA", 27027) )); 
		}; 
	}
}
