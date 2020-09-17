package com.training.ds.list;

// LIFO 
public class Stack {
	private int arr[];
	private int top;
	private int capacity;

	public Stack(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	
	// O(1)
	public void push(int element) {
		if (isFull()) {				// 
			System.out.println("Sorry reached fulle");
			return;
		}
		System.out.println("Inserting: " + element);
		arr[++top] = element;
	}

	private boolean isFull() {
		return top == capacity - 1;
	}

	
	//O(1) 
	public int pop() {
		if (isEmpty()) {
			System.out.println("Sorry no elements... ");
			System.exit(0);
		}
		return arr[top--];
	}

	private boolean isEmpty() {
		return top == -1;
	}

	public int size() {
		return top + 1;
	}
	
	public void print() {
		for(int i=0; i<=top; i++) {
			System.out.println(arr[i]);
		}
	}
}



















