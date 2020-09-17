package com.training.ds.linkedlist;

public class DoublyLinkedList<E> {
	private class Node<E> {
		private E element; 
		private Node<E> prev; 
		private Node<E> next;
		
		public Node(E element,  Node<E> prev, Node<E> next) {
			this.element = element;
			this.prev = prev;
			this.next = next;
		}
		public E getElement() {
			return element;
		}
		public void setElement(E element) {
			this.element = element;
		}
		public Node<E> getPrev() {
			return prev;
		}
		public void setPrev(Node<E> prev) {
			this.prev = prev;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> next) {
			this.next = next;
		} 
	} // end of Node 


	// header and trailer node are empty -> sentinial nodes 
	private Node<E> header; 
	private Node<E> trailer; 
	private int size =0; 
 	
	
	public DoublyLinkedList() {
		header = new Node<E>(null, null, null); 
		trailer = new Node<E> (null, header, null);
		header.setNext(trailer);
	}
	
	public E first() {
		if(isEmpty()) {
			return null;
		}
		return header.getNext().getElement(); 
	}
	
	public E last() {
		if(isEmpty()) {
			return null; 
		}
		
		return trailer.getPrev().getElement(); 
	}

	private boolean isEmpty() {
		return size ==0; 
	}
	
	public void addFirst(E e) {
		addBetween(e, header, header.next); 
	}
	public void addLast(E e ) {
		addBetween(e, trailer.prev, trailer); 
	}
	
	private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
		Node<E> newNode = new Node<E> (e, predecessor, successor); 
		predecessor.setNext(newNode);
		successor.setPrev(newNode);
		
		size ++; 
	}
	
	public E removeFirst() {
		if(isEmpty())
			return null; 
		
		return remove(header.getNext()); 
	}
	
	public E removeLast() {
		if(isEmpty())
			return null; 
		
		return remove(trailer.getPrev()); 
	}
	
	private E remove(Node<E> node) {
		Node<E> prev = node.getPrev(); 
		Node<E> next = node.getNext();
		
		
		prev.setNext(next);
		next.setPrev(prev);
		size --; 
		
		return node.getElement(); 
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("("); 
		
		// header does not have any data (null) 
		// the data node starts from header.getNext(); 
		
		Node<E> displayNode = header.getNext();
		
		while(displayNode != trailer) {
			sb.append(displayNode.getElement()); 
			displayNode = displayNode.getNext(); 
			
			if(displayNode != trailer) {
				sb.append(","); 
			}
		}
		sb.append(")"); 
		return sb.toString();
	}
	
	

}













