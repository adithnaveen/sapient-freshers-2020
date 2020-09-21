package com.training.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	private class Node {
		private int value; 
		private Node left; 
		private Node right;
	
		public Node(int value ) {
			super();
			this.value = value;
		}

		@Override
		public String toString() {
			return "Node [value=" + value + ", left=" + left + ", right=" + right + "]";
		} 
	}
	
	
	private Node root; 
	private int size; 

	
	public Node getRoot() {
		return root;
	}

	
	public void add(int value) {
		root = addRecursive(root, value); 
		size ++; 
	}

	private Node addRecursive(Node current, int value) {
		if(current == null) {
			return new Node(value); 
		}
		
		if(value < current.value) {
			current.left = addRecursive(current.left, value); 
		}else if (value > current.value ) {
			current.right = addRecursive(current.right, value); 
		}
		
		return current; 
	}
	
	public boolean isEmpty() {
		return root == null; 
	}
	
	public int intSize() {
		return size; 
		
	}
	
	public int getSize () {
		return getRecursiveSize(root); 
	}

	private int getRecursiveSize(Node current) {
		return current == null ? 0 : getRecursiveSize(current.left) + 1 + 
				getRecursiveSize(current.right);
	}
	
	public boolean containsNode(int value) {
		return containsNodeRecursive(root, value); 
	}

	private boolean containsNodeRecursive(Node current, int value) {
		// if the tree is empty,  no element 
		 if(current == null) {
			 return false; 
		 }
		 // if the root is the searched element 
		 if(value == current.value) {
			 return true; 
		 }
		 
		 return value < current.value ? containsNodeRecursive(current.left, value) : 
			 containsNodeRecursive(current.right, value); 
	}
	
	public void delete(int value) {
		root = deleteRecursive(root, value); 
	}

	private Node deleteRecursive(Node current, int value) {
		// if there are no elements 
		if(current == null) {
			return null; 
		}
		
		if(value == current.value) {
			// no child (only root element) 
			if(current.left == null && current.right==null) {
				return null; 
			}
			
			// if there is 1 child 
			if(current.right == null) {
				return current.left; 
			}
			
			if(current.left == null) {
				return current.right; 
			}
			
			
			// if the node has 2 children 
			int smallestValue = findSmallestValue(current.right); 
			current.value = smallestValue ;
			current.right = deleteRecursive(current.right, smallestValue); 
			return current; 
		}
		
		
		if(value < current.value) {
			current.left = deleteRecursive(current.left, value);
			return current; 
		}
		
		current.right = deleteRecursive(current.right, value); 
		return current; 
		
	}

	private int findSmallestValue(Node root) {
		return root.left == null ? root.value : findSmallestValue(root.left); 
	}
	
	
	public void traverseInOrder(Node node) {
		if(node!= null) {
			traverseInOrder(node.left);
			printNode(node.value); 
			traverseInOrder(node.right);
		}
	}
	
	public void traversePostOrder(Node node) {
		if(node!= null) {
			traversePostOrder(node.left);
			traversePostOrder(node.right);
			printNode(node.value);
		}
	}
	public void traversePreOrder(Node node) {
		if(node!= null) {
			printNode(node.value);
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}
	}
	
	
	public void traverseLevelOrder(Node node) {
		if(node != null) {
			Queue<Node> nodes = new LinkedList<Node>(); 
			
			// will hold entire tree 
			nodes.add(node); 
			
			while(!nodes.isEmpty()) {
				Node temp = nodes.remove(); 
				System.out.println(" " +  temp.value);
				
				if(temp.left != null) {
					nodes.add(temp.left);
				}
				
				if(temp.right != null) {
					nodes.add(temp.right); 
				}
			}
		}
	}
	private void printNode(int value) {
		System.out.print("-> " + value);
	}


	@Override
	public String toString() {
		return "BinaryTree [root=" + root + ", size=" + size + "]";
	}
	
	
	
	
	
	
	
	
}














