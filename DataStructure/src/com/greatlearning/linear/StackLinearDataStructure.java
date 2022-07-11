package com.greatlearning.linear;

public class StackLinearDataStructure {

	int current = -1;
	int sizeOfStack = 100;
	int arr[] = new int[sizeOfStack];
	
	boolean push(int value) {
		if( current >= ( sizeOfStack - 1)) {
			System.out.println("Stack overflow");
			return false;
		}
		else {
			arr[++current] = value;
			System.out.println( value +"added in stack");
			return true;
		}
	}
	
	int pop() {
		if( current < 0) {
			System.out.println("Stack underflow");
			return 0;
		}
		else {
			int val = arr[current--];
			return val;
		}
	}
	
	void printStack() {
		for( int i = 0; i <= current; i++) {
			System.out.print(" "+ arr[i]);
		}
		System.out.println(" ");
	}
	
public static void main(String args[]) {
		
		StackLinearDataStructure stack = new StackLinearDataStructure();
		// push
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.printStack();
		stack.pop();
		stack.pop();
		stack.printStack();
	}
	
	
}
