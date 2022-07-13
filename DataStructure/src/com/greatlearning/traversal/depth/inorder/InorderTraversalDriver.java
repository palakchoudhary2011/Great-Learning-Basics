package com.greatlearning.traversal.depth.inorder;

import com.greatlearning.traversal.depth.inorder.Node;

public class InorderTraversalDriver {

	public static void main(String args[]) {
		InorderTraversalService inOrder = new InorderTraversalService();
		
		Node temp =  inOrder.newNode(10);
		temp.left = inOrder.newNode(20);
		temp.right = inOrder.newNode(30);
		temp.left.left = inOrder.newNode(40);
		temp.left.right = inOrder.newNode(50);
		temp.right.left = inOrder.newNode(60);
		temp.right.right = inOrder.newNode(70);
		
		inOrder.inorder(temp);
	}
	
}
