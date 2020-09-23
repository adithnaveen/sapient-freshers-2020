package com.training.singleton;

// lazy singleton 
class Company {
	private Company () {
		System.out.println("Company Created... ");
	}
	
	public static Company getInstance(Company company) {
		if(company == null ) {
			return new Company(); 
		}
		
		return company; 
	}
}


public class LazySingleTon02 {
	public static void main(String[] args) {
		Company company = null; ; 
		company = Company.getInstance(company); 
		System.out.println("Company @ " + company.hashCode());
		
		Company c1 = Company.getInstance(company); 
		System.out.println("Company @ " + c1.hashCode());
		
	}
}
