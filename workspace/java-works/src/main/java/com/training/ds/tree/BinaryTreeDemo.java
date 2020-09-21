package com.training.ds.tree;

public class BinaryTreeDemo {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();

		System.out.println("is Empty " + binaryTree.isEmpty());

		binaryTree.add(100);
		binaryTree.add(55);
		binaryTree.add(78);
		binaryTree.add(154);
		binaryTree.add(77);

		System.out.println(binaryTree);

		System.out.println("Traverse IN-ORDER");
		binaryTree.traverseInOrder(binaryTree.getRoot());

		System.out.println();
		System.out.println("Traverse PRE-ORDER");
		binaryTree.traversePreOrder(binaryTree.getRoot());
		System.out.println();

		System.out.println("Traverse Post Order");
		binaryTree.traversePostOrder(binaryTree.getRoot());
		System.out.println();

		System.out.println("Level order");
		binaryTree.traverseLevelOrder(binaryTree.getRoot());
	}
}
