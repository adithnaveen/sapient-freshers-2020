package com.training.builder.entity;

public class EmployeeCreateClient {
	public static void main(String[] args) {
		Employee e = new Employee(101, "Chandan", 0, "chandan@gmail.com"); 	
		System.out.println(e);
		
		Employee e1 = new Employee().setEmpId(101).setEmpName("Chandan").setEmpEmail("chandan@msn.com"); 
		
		
		
	}
}
