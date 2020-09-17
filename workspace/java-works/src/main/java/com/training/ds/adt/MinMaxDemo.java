package com.training.ds.adt;

public class MinMaxDemo {
	public static void main(String[] args) {
		Integer iNums [] = {34,56,53,10,33,9};
		Character cNums [] = {'a', 'd', 'p', 's', 't'};
		
		MinMaxClass<Integer> mmc1 = new MinMaxClass<Integer>(iNums); 
		
		System.out.println("Min is : " + mmc1.min());
		System.out.println("Max is : " + mmc1.max());
	}
}
