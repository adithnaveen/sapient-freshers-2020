package com.training.entity;

public class Employee {
	private int empId; 
	private String empName; 
	private String empEmail; 
	private double empSalary;
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empSalary="
				+ empSalary + "]";
	}

	public Employee() {}
	
	public Employee(int empId, String empName, String empEmail, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	} 
	
	
	
	
}
