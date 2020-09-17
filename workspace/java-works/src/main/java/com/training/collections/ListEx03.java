package com.training.collections;

import java.util.Vector;

public class ListEx03 {
	public static void main(String[] args) {
		Vector<String> list = new Vector<String>(); 
		
		System.out.println("Initial Size : " + list.size());
		System.out.println("Initial Capacity : " + list.capacity());
		
		list.add("One"); 
		list.add("Two"); 
		list.add("Three"); 
		list.add("Four"); 
		list.add("Five"); 
		list.add("One"); 
		list.add("Two"); 
		list.add("Three"); 
		list.add("Four"); 
		list.add("Five"); 
		
		list.add("India"); 
		list.add("India"); 
		
		
		System.out.println("After adding size : "+list.size());
		System.out.println("After adding capacity : "+ list.capacity());
		
	}
}
