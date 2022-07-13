package com.greatlearning.traversal.depth.preorder;


class Node{
	int key;
	Node left;
	Node right;
}




public class PreorderTraversalService {

	static Node newNode(int data) {
		Node temp = new Node();
		
		temp.key = data;
		temp.left = null;
		temp.right = null;
		
		return temp;
	}

	public void preorder(Node node) {
		if(node == null) {
			return;
		}
		else {
			System.out.print(node.key + "->");
			preorder(node.left);
			preorder(node.right);
		}
	}
}
