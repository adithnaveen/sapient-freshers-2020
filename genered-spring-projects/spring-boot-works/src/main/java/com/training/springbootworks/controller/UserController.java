package com.training.springbootworks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.springbootworks.beans.User;
import com.training.springbootworks.service.UserDBService;

@RestController
public class UserController {
	
	@Autowired
	private UserDBService service; 

	@GetMapping(path="/db/users")
	public List<User> getAllUsersFromDB() {
		return service.getAllUsers(); 
	}
	
}
