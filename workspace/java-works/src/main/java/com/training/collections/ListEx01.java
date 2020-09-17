package com.training.collections;

import java.util.ArrayList;

// raw type 

public class ListEx01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("Hello"); 
		list.add(12); 
		list.add(45.6); 
		list.add(true); 
		list.add(new Object()); 
		
		
		for(Object temp : list) {
			System.out.println(temp);
		}
		
		
		
	}
}
