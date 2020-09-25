package com.training.bl;

import com.training.bean.User;

public class LoginValidate {

	// this has to be validated with DB 
	public boolean validate(User user) {
		return user.getUserName().equals("sapient") && 
				user.getPassword().equals("india");  
	}
}
