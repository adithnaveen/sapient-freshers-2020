package com.training.springbootworks.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.training.springbootworks.beans.User;

// all CRUD operations are done 
@Repository
public interface UserRepository extends MongoRepository<User, Integer>{
 
	
	public User findByUserName(String userName); 
	
	@Query(value = "{'userAge':'{$gt:?0}'}")
	public List<User> findByUserAge(Integer age); 
}
