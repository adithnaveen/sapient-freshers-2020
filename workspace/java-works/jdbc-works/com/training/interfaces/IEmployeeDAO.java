package com.training.interfaces;

import java.util.List;

import com.training.entity.Employee;

public interface IEmployeeDAO {
	// CRUD Operations go here 
	
	public boolean insertEmployee(Employee employee); 
	
	public boolean deleteEmployee(int empId); 
	
	public Employee updateEmployee(int empId, String empEmail); 
	
	public Employee getEmployee(int empId); 
	
	public List<Employee> getAllEmployees(); 
}
