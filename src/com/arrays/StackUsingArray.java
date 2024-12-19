package com.arrays;

//stack - LIFO - Last In First Out
public class StackUsingArray {
	
	int[] stack;
	int top;
	
	StackUsingArray(int size){
		
		 // Constructor to initialize the stack with a fixed size
		stack = new int[size]; // Create the stack with the given size
		top = -1;        // Initialize the top index as -1 (empty stack)
		
	}
	
	// Method to push an element into the stack
	void push(int x) {
		
		if(top==stack.length-1) {
			System.out.println("Stack OverFlow ");
			return;
			
		}
		stack[++top] = x;
	}
	
	 // Method to pop an element from the stack
	  public int pop() {
		
		if(top == -1) {
			return -1; // If the stack is empty, return -1	
		}
		return stack[top--]; // Return the top element and decrement top
		
	}
	  
	  public int peek() {
		    if (top == -1) {
		        System.out.println("Stack is empty");
		        return -1; // Return -1 if stack is empty
		    }
		    return stack[top]; // Return the top element without removing it
		}
	
	
	
	
}
