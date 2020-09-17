package com.training.ds.list;

// LIFO 
public class StackGen<T> {
	private T arr[];
	private int top;
	private int capacity;

	public StackGen(int size) {
		arr = (T[]) new  Object[size]; 
		capacity = size;
		top = -1;
	}

	public void push(T element) {
		if (isFull()) {
			System.out.println("Sorry reached full");
			return;
		}
		System.out.println("Inserting: " + element);
		arr[++top] = element;
	}

	private boolean isFull() {
		return top == capacity - 1;
	}

	public T pop() {
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



















