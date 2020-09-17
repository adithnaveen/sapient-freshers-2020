package com.training.ds.adt;


// int (not valid), Integer (valid) 
// float (not valid), Float (valid) 

public class GenDemo {
	public static void main(String[] args) {
		
		// created a Reference of Gen for Integers 
		Gen<Integer> iOb = new Gen<Integer>(100); 
		System.out.println(iOb.getObj());
		iOb.showType();

		Gen<String> sObj = new Gen<String>("Hello"); 
		System.out.println(sObj.getObj());
		sObj.showType(); 

		// no type casing required, because the 
		// object stored is type safe 
		String temp = sObj.getObj(); 
		System.out.println("Temp : " + temp);
	}
}
