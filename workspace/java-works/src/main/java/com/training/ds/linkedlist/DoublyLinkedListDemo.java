package com.training.ds.linkedlist;

public class DoublyLinkedListDemo {
	public static void main(String[] args) {
		DoublyLinkedList<String> list = new DoublyLinkedList<String>(); 
		
		list.addFirst("One");
		list.addFirst("Two");
		list.addLast("Three");
		
		
		System.out.println(list);
		list.removeFirst(); 
		System.out.println(list);
		list.removeLast(); 
		System.out.println(list);
		
	}
}
