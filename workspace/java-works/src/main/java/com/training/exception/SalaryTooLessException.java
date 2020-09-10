package com.training.exception;

//since exception is checked then sub class of that is also checked 

class SalaryTooLessException extends Exception {
	private String message;

	public SalaryTooLessException() {
		this.message = "Salary too less";
	}

	public SalaryTooLessException(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String toString() {
		return "SalaryTooLessException [message=" + message + "]";
	}
}
