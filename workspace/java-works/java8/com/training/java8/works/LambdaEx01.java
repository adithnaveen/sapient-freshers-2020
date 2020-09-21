package com.training.java8.works;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaEx01 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,4,5,77,2,44,8);
		
		// old style 
		for(int i=0; i<list.size();i++) {
			System.out.print("\t"+ list.get(i));
		}
		
		
		System.out.println();
		// old style - enhanced for loop  
		for(Integer temp : list) {
			System.out.print("\t"+ temp);
		}
		
		System.out.println();
		// lambda way 
		list.forEach((t) -> System.out.print("\t" +t));
		
		System.out.println();
		
		// behind the screen 
	 
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {

				System.out.print("\t" +t); 
			}
		});
		
	}
}











