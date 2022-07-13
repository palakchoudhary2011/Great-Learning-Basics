package com.greatlearning.traversal.depth.postorder;


public class PostorderTraversalDriver {

public static void main(String args[]) {
		
		PostorderTraversalService postorder = new PostorderTraversalService();
		
		Node root = postorder.newNode(10);
		root.left = postorder.newNode(20);
		root.right = postorder.newNode(30);
		root.left.left = postorder.newNode(40);
		root.left.right = postorder.newNode(50);
		root.right.left = postorder.newNode(60);
		root.right.right = postorder.newNode(70);
		
		postorder.postOrder(root);
	}

}
