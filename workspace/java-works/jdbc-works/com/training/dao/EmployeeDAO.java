package com.training.dao;

import java.sql.SQLException;
import java.util.List;

import com.training.connection.GetConnection;
import com.training.entity.Employee;
import com.training.interfaces.IEmployeeDAO;

public class EmployeeDAO  implements IEmployeeDAO{

	@Override
	public boolean insertEmployee(Employee employee) {
		String sql ="insert into employee1 (empid,ename,email,salary ) values (?,?,?,?)";
		
		GetConnection gc = new GetConnection(); 
		
		try {
			gc.ps = GetConnection.getPostgresConnection().prepareStatement(sql); 
			gc.ps.setInt(1, employee.getEmpId());
			gc.ps.setString(2, employee.getEmpName());
			gc.ps.setString(3, employee.getEmpEmail());
			gc.ps.setDouble(4, employee.getEmpSalary());
			
			return gc.ps.executeUpdate() >0;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return false;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee updateEmployee(int empId, String empEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
