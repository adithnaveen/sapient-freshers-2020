package com.training.exception;


public class EmployeeMgmt {
	public static void checkName(String name) throws NameTooSmallException {
		if (name.length() < 5) {
			throw new NameTooSmallException();
		}
	}

	public static void paySalary(String name, int salary) throws Exception {

		try {
			checkName(name);
			if (salary < 1000) {
				throw new SalaryTooLessException("Sorry you salary is less: " + salary);
			} else {
				System.out.println("you are paid salary: " + salary);
			}
		} catch (NameTooSmallException e) {
			e.printStackTrace();
			throw new Exception("Name was too small so salary not processed", e); 
		}
	}

	public static void main(String[] args) {
		try {
			paySalary("Ashutosh", 100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
