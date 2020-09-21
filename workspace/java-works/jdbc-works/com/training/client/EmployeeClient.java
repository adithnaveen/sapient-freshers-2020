package com.training.client;

import com.training.dao.EmployeeDAO;
import com.training.entity.Employee;
import com.training.interfaces.IEmployeeDAO;

public class EmployeeClient {
	public static void main(String[] args) {
		Employee employee = new Employee(101, "Shashank", "shashank@gmail.com", 12345);

		IEmployeeDAO dao = new EmployeeDAO();
//		System.out
//				.println(dao.insertEmployee(new Employee(103, "Harsh", "harsh@gmail.com", 22113)) 
//							? "Record Inserted"
//						: "Sorry not inserted");
		
		
	//	System.out.println(dao.deleteEmployee(101) ? "Deleted":"Record Not Found");
		
		Employee emp = dao.getEmployee(102); 
		
		System.out.println(emp);
		
	}
}
