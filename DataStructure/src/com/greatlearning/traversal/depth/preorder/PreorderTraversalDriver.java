package com.greatlearning.traversal.depth.preorder;

public class PreorderTraversalDriver {

	public static void main(String args[]) {
		
		PreorderTraversalService preorder = new PreorderTraversalService();
		
		Node root =  preorder.newNode(10);
		
		root.left = preorder.newNode(20);
		root.right = preorder.newNode(30);
		root.left.left = preorder.newNode(40);
		root.left.right = preorder.newNode(50);
		root.right.left = preorder.newNode(60);
		root.right.right = preorder.newNode(70);
		
		preorder.preorder(root);
	}
}
