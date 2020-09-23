package com.training.builder.entity;

public class Employee {
	private int empId; 
	private String empName; 
	private double empSal; 
	private String empEmail;
	
	
	public Employee(int empId, String empName, double empSal, String empEmail) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empEmail = empEmail;
	} 
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee Employee() {
		return this; 
	}

	public int getEmpId() {
		return empId;
	}

	public Employee setEmpId(int empId) {
		this.empId = empId;
		return this;
	}

	public String getEmpName() {
		return empName;
	}

	public Employee setEmpName(String empName) {
		this.empName = empName;
		return this;
	}

	public double getEmpSal() {
		return empSal;
	}

	public Employee setEmpSal(double empSal) {
		this.empSal = empSal;
		return this;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public Employee setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
		return this;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empEmail=" + empEmail
				+ "]";
	}
	
	
	
}
