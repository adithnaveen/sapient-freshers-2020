package com.training.springbootworks.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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

	// http://localhost:7070/api/db/users/110
//	@GetMapping(path = "/db/users/{id}", 
//				produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@GetMapping(path = "/db/user/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public User getUser( @PathVariable("id")  Integer id) throws UserNotFoundException  {
		try {
			User user  = this.service.getUserByIdAsObject(id); 
//			user.add(linkTo(methodOn(UserController.class).getAllUsersFromDB()).withSelfRel()); 
			
			return user;
		} catch (UserNotFoundException e) {
			e.printStackTrace();
			// partial delegation 
			throw new UserNotFoundException("From Controller the user Not Found : " +e.toString()); 
			
		}
	}
	
	@PostMapping(path =  "/db/user")
	@ResponseStatus(code = HttpStatus.CREATED)   //201
	public User saveUser(@RequestBody User user) {
		System.out.println("User -> " + user);
		return service.insertUser(user); 
	}
	
	@DeleteMapping(path = "/db/user/{id}")
	public ResponseEntity<String>  deleteUser(@PathVariable Integer id) {
		System.out.println("in delete... " + id);
		if(service.getUserById(id).isPresent()) {
			service.deleteUserById(id);
			return new ResponseEntity<String>("User with Id: " + id +" delete " , HttpStatus.OK); 
		}
		
		return new ResponseEntity<String>("User with Id  " + id +"  Not Found " , HttpStatus.NOT_FOUND); 
		
	}
	
	
	@PutMapping(path="/db/user")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
