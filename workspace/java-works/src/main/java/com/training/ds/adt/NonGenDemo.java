package com.training.ds.adt;

public class NonGenDemo {
	public static void main(String[] args) {
		NonGen iObj = new NonGen(200); 
		System.out.println(iObj.getObj());
		iObj.showType();
		
		int temp = (int) iObj.getObj(); 
		System.out.println(temp);
		
		NonGen sObj = new NonGen("Hello"); 
		System.out.println(sObj.getObj());
		sObj.showType();
		
		iObj = sObj; 
		temp = (int) sObj.getObj(); 
		System.out.println("Temp " + temp);
		
	}
}
