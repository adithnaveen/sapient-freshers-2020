package com.training.ds.linkedlist;

public class SinglyLinkedListDemo {
	public static void main(String[] args) {
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();

		System.out.println(list);
		list.addFirst("One");
		System.out.println(list);
		list.addFirst("Two");
		System.out.println(list);
		list.addLast("Three");
		System.out.println(list);
		
		list.removeFirst(); 
		System.out.println(list);
	}
}
