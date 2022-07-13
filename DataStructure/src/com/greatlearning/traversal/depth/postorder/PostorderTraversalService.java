package com.greatlearning.traversal.depth.postorder;

class Node{
	int key;
	Node left;
	Node right;
}

public class PostorderTraversalService {


	static Node newNode(int data) {
		Node temp = new Node();
		
		temp.key = data;
		temp.left = null;
		temp.right = null;
		return temp;
	}
	
	void postOrder(Node node) {
		
		if( node == null) {
			return;
		}
		else {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.key + " : ");
		}
	}
}
