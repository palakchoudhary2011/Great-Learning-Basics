package com.greatlearning.linear;


public class CircularSingleLinkedListLinearDataStructure {
	
	private Node head;
	
	// insert at first node
	public void insertAtFirst(int value) {
		Node node = new Node();
		node.nodeData = value;
		node.nextNode = node;
		head = node;
	}
	
	// insert last node
	
	// insert at posistion
	
	// delete first element
	
	// delete last element
	
	// delete at position
	
	// print list
	public void showList() {
		Node currentNode = head;
		while( currentNode != null) {
			System.out.print(currentNode.nodeData+" ==>");
		}
		System.out.println("Null");
	}	

	public static void main(String args[]) {
		CircularSingleLinkedListLinearDataStructure list = new CircularSingleLinkedListLinearDataStructure();
		list.insertAtFirst(100);
		list.insertAtFirst(90);
		list.insertAtFirst(80);
		list.insertAtFirst(70);
		list.insertAtFirst(60);
		list.insertAtFirst(50);
		list.insertAtFirst(40);
		list.insertAtFirst(30);
		list.insertAtFirst(20);
		list.insertAtFirst(10);
		list.showList();
		
	}
}
