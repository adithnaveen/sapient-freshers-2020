package com.training.singleton;

public class EagerSingleton {
	
	// the reference of this object is always there 
	// only one instance 
	private static final EagerSingleton eagerSingleton = new EagerSingleton();   
	// nobody from outside can create an object 
	private EagerSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static EagerSingleton getInstance() {
		return eagerSingleton; 
	}
}
