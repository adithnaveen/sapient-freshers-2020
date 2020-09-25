package com.training.springbootworks.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springbootworks.beans.User;
import com.training.springbootworks.repo.UserRepository;

@Service
public class UserDBService {

	@Autowired
	private UserRepository repo; 
	
	// is new addition in java 8 to avoid null pointer exception 
	public Optional<User> getUserById(Integer id) {
		return this.repo.findById(id); 
	}
	
	public User getUserByIdAsObject(Integer id) {
		Optional<User> findById = this.getUserById(id);
		return findById.get(); 
	}
	
	public User getUserByUserName(String userName) {
			return this.repo.findByUserName(userName); 
	}
	
	public User insertUser(User user) {
		return this.repo.insert(user); 
	}
	
	public User updateUser(User user) {
		return this.repo.save(user); 
	}
	
	public void deleteUserById(Integer id) {
		this.repo.deleteById(id); 
	}
	
	public List<User> getAllUsers() {
		return this.repo.findAll(); 
	}
	
	public List<User> getUserAgeLimi(int age) {
		return this.repo.findByUserAge(age); 
	}
	
}












