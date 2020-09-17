package com.training.ds.list;

public class StackGenImpl {
	public static void main(String[] args) {
		StackGen<String> stack = 
				new StackGen<String>(5);

		stack.push("One");
		stack.push("Two");
		stack.push("Three");
		stack.push("Four");

		stack.print();

		stack.pop();
		System.out.println("---------------------");
		stack.print();
	}
}
