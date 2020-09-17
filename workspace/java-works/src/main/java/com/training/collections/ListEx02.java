package com.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx02 {
	public static void main(String[] args) {
		
		ArrayList<Integer> iList = new ArrayList<Integer>(); 
		
		System.out.println(iList.size());
		iList.add(100); 
		iList.add(200); 
		iList.add(300); 
		iList.add(400); 
		iList.add(500); 
		
		System.out.println(iList.size());
		
		
		System.out.println(iList);
		
		 Iterator<Integer> itr = iList.iterator();
		 
		 while(itr.hasNext()) {
			 int temp = itr.next(); 
			 
			 System.out.println(temp);
		 }
		 System.out.println("-----------------------------------");
		 
		 List<Integer> subList1 = iList.subList(0, 3);
		 
		 for(Integer i : subList1) {
			 System.out.println(i);
		 }
		
		 subList1.set(0, 123); 
		 System.out.println(subList1);
		 
		 subList1.remove(1); 
		 System.out.println(subList1);
		
		 subList1.clear(); 
		 
		 System.out.println(subList1);
		 
	}
}








