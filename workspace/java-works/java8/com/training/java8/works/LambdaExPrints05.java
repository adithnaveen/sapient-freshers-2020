package com.training.java8.works;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class MyConsumer<T> implements Consumer<T> {

	@Override
	public void accept(T t) {
		System.out.println(t);
	}
}

// have custom consumer 
// check for valid String 
public class LambdaExPrints05 {
	public static void main(String[] args) {
		
		List<Integer> ints= Arrays.asList(43,5,63,55,11,56,89); 
		MyConsumer myConsumer = new MyConsumer();
		
		ints.forEach(myConsumer);
		/////////////////////////////////////////////
		
		List<String> strings = Arrays.asList("hello", "how", "", "are", "you"); 
		
		List<String> filterString = strings.stream().filter(string -> !string.isEmpty())
							.collect(Collectors.toList()); 
		
		filterString.forEach(myConsumer);
		
		// to generate some random numbers 
		Random random = new Random();
		
		random.ints().limit(10).forEach(System.out :: println);
		
		
	}
}















