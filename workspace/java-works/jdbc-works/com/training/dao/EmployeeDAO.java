package com.training.dao;

import java.sql.SQLException;
import java.util.List;

import com.training.connection.GetConnection;
import com.training.entity.Employee;
import com.training.interfaces.IEmployeeDAO;

public class EmployeeDAO implements IEmployeeDAO {

	// Arrays -0
	// positional parameters - 1
	// iterators -1
	@Override
	public boolean insertEmployee(Employee employee) {
		String sql = "insert into employee1 (empid,ename,email,salary ) " + "values (?,?,?,?)";

		GetConnection gc = new GetConnection();

		try {
			gc.ps = GetConnection.getPostgresConnection().prepareStatement(sql);
			gc.ps.setInt(1, employee.getEmpId());
			gc.ps.setString(2, employee.getEmpName());
			gc.ps.setString(3, employee.getEmpEmail());
			gc.ps.setDouble(4, employee.getEmpSalary());

			return gc.ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		String sql = "delete from employee1 where empid = ?";
		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.getPostgresConnection().prepareStatement(sql);

			gc.ps.setInt(1, empId);
			return gc.ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				gc.ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public Employee updateEmployee(int empId, String empEmail) {
		// check if the employee exists
		// if so update
		// if not return null;

		String sql = "update employee1 set email = ? where empid =?";

		try {
			Employee employee = getEmployee(empId);
			if (employee != null) {

				GetConnection gc = new GetConnection();
				gc.ps = GetConnection.getPostgresConnection().prepareStatement(sql);
				gc.ps.setString(1, empEmail);
				gc.ps.setInt(2, empId);
				return employee;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		return null;

	}

	@Override
	public Employee getEmployee(int empId) {
		String sql = "select ename,email,salary from employee1 where empid=?";

		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.getPostgresConnection().prepareStatement(sql);
			gc.ps.setInt(1, empId);

			gc.rs = gc.ps.executeQuery();

			if (gc.rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(empId);
				employee.setEmpName(gc.rs.getString(1));
				employee.setEmpEmail(gc.rs.getString(2));
				employee.setEmpSalary(gc.rs.getDouble(3));

				return employee;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
