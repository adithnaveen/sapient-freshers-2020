package com.training.ds.list;

public class StackImpl {
	public static void main(String[] args) {
		Stack stack = new Stack(5);

		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);

		stack.print(); 

		stack.pop();
		System.out.println("-------------------");
		stack.print(); 
		
		
	}
}
