package com.training.io;

import java.beans.Transient;
import java.io.Serializable;

public class Emp implements Serializable {
	  
	private static final long serialVersionUID = -5458878121945014550L;
	private int empId; 
	private String empName; 
	private double empSal; 
	
	public Emp() {
	}

	public Emp(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
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

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
}
