package com.training.ds.adt;

public class TwoGenDemo {
	public static void main(String[] args) {

		TwoGen<Integer, String> twoGen =
				new TwoGen<Integer, String>(100, "Sapient");
		

		twoGen.showTypes(); 
		
		
		System.out.println("Object 1 : "+twoGen.getObj1());
		System.out.println("Object 2 : "+twoGen.getObj2());

	}
}
