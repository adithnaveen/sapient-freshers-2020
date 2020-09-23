package com.training.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EagerSingletonReflection03 {
	public static void main(String[] args) throws
	InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		EagerSingleton es1 = EagerSingleton.getInstance(); 
		
		EagerSingleton es2 = null; 
		EagerSingleton es3 = null;
		
		Constructor[] declaredConstructors = EagerSingleton.class.getDeclaredConstructors(); 
		
		for(Constructor c : declaredConstructors) {
			// we can destroy single ton 
			c.setAccessible(true); 
			es2 = (EagerSingleton) c.newInstance(); 
			es3 = (EagerSingleton) c.newInstance(); 
		}
		
		System.out.println("es1 @ hashcode -  " + es1.hashCode());
		System.out.println("es2 @ hashcode -  " + es2.hashCode());
		System.out.println("es3 @ hashcode -  " + es3.hashCode());
		
	}
}	
