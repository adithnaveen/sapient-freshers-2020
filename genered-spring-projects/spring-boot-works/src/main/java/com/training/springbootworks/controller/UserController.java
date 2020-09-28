package com.training.springbootworks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;




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

	// http://localhost:7070/api/db/users/110
//	@GetMapping(path = "/db/users/{id}", 
//				produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@GetMapping(path = "/db/users/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public User getUser( @PathVariable("id")  Integer id) throws UserNotFoundException  {
		try {
			User user  = this.service.getUserByIdAsObject(id); 
			user.add(linkTo(methodOn(UserController.class).getAllUsersFromDB()).withSelfRel()); 
			
			return user;
		} catch (UserNotFoundException e) {
			e.printStackTrace();
			// partial delegation 
			throw new UserNotFoundException("From Controller the user Not Found : " +e.toString()); 
			
		}
	}
}
