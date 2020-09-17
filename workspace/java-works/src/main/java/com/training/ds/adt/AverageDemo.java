package com.training.ds.adt;

public class AverageDemo {
	public static void main(String[] args) {
		Integer [] iArr  = new Integer[]{4,5,7,3,32, 8};; 
		Average<Integer> iAvg = new Average<Integer>(iArr); 
		System.out.println(iAvg.average());

		Double [] dArr = new Double [] {45.4,55.6,22.2,1.1}; 

		Average<Double> dAvg = new Average<Double>(dArr); 
		System.out.println(dAvg.average());
		
		
		String [] sArr = new String[] {"Hello", "How", "Are", "You"};
		// this wont compile because String is not a child of 
		// Number class 
//		Average<String> sAvg = new Average<String>(); 
	}
}
