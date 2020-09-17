package com.training.ds.linkedlist;

public class SinglyLinkedList<E> {
 
	private class Node<E> {
		private E value;
		private Node<E> next;

		public Node(E value, Node<E> next) {
			super();
			this.value = value;
			this.next = next;
		}

		public E getValue() {
			return value;
		}

		public Node<E> getNext() {
			return next;
		}
		
		
		

		public void setNext(Node<E> next) {
			this.next = next;
		}

		@Override
		public String toString() {
			return "Node [value=" + value + ", next=" + next + "]";
		}
	}


	// sentinial nodes 
	private Node<E> head = null; 
	private Node<E> tail = null; 
	private int size = 0; 
	
	public SinglyLinkedList() {
	}

	public void addFirst(E e) {
		head = new Node<E>(e, head); 
		
		if(size ==0) {
			tail = head; 
		}
		size ++; 
	}
	
	public void addLast(E e) {
		Node<E> newNode = new Node<>(e, null);
		
		if(isEmpty()) {
			head = newNode; 
		}else  {
			tail.setNext(newNode);
		}
		
		tail = newNode; 
		size ++; 
		
		
	}
	
	private boolean isEmpty() {
		return size ==0; 
	}
	
	public E removeFirst () {
		if(isEmpty()) {
			return null;
		}
		
		E content = head.getValue(); 
		head = head.getNext(); 
		
		size -- ; 
		if(isEmpty()) {
			tail = null; 
		}
		return content; 
		
	}
	
	public E removeLast() {
		// TODO 
		return null; 
	}
	
	public int size() {
		return size; 
	}

	@Override
	public String toString() {
		return "SinglyLinkedList [head=" + head + ", tail=" + tail + ", size=" + size + "]";
	}
	
	
}













