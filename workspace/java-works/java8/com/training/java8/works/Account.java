package com.training.java8.works;

public class Account {
	private int accId;
	private String custName;
	private double balance;
	private String sex;

	public Account(int accId, String custName, double balance, String sex) {
		super();
		this.accId = accId;
		this.custName = custName;
		this.balance = balance;
		this.sex = sex;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", custName=" + custName + ", balance=" + balance + ", sex=" + sex + "]";
	}

}
