package com.training.io;

import java.util.Scanner;

public class ReadData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter a number: ");
		int num1 = sc.nextInt(); 
		
		System.out.println("Enter name : "); 
		String name = sc.next(); 
		
		System.out.println("Number is : " + num1);
		System.out.println("Name is " + name);
		
		sc.close(); 
	}
}
