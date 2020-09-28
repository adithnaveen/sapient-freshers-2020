package com.training.springbootworks.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.springbootworks.beans.User;
import com.training.springbootworks.exception.UserNotFoundException;
import com.training.springbootworks.service.UserDBService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserDBService service; 

	@GetMapping(path="/db/users")
	public List<User> getAllUsersFromDB() {
		return service.getAllUsers(); 
	}

	@GetMapping(path = "/db/users/{id}", produces = "application/json")
	public User getUser( @PathVariable("id")  Integer id) throws UserNotFoundException  {
		try {
			User user  = this.service.getUserByIdAsObject(id); 
			return user;
		} catch (UserNotFoundException e) {
			e.printStackTrace();
			// partial delegation 
			throw new UserNotFoundException("From Controller the user Not Found : " +e.toString()); 
			
		}
	}
}
