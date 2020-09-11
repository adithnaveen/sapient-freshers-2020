package com.training.interfaces;

import java.util.Arrays;

public class SortInts {
	public static void main(String[] args) {
		int arr[] = new int[] {23,45,6,7,33,22,89};
		
		for(int temp: arr) {
			System.out.println(temp);
		}
		
		Arrays.sort(arr);
		
		System.out.println("After sort");
		
		for(int temp: arr) {
			System.out.println(temp);
		}
		
		String names[] = new String[] {"harry", "peter", "prashanth", "uday", "suresh", "harsh"}; 
		
		
		for(String temp: names) {
			System.out.println(temp);
		}
		
		Arrays.sort(names);
		System.out.println("After sort");

		for(String temp: names) {
			System.out.println(temp);
		}
		
		
	}
}
