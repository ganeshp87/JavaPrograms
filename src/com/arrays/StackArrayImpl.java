package com.arrays;

import java.util.Scanner;

public class StackArrayImpl {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the queries for the stack operations (e.g., '1 2 1 3 2 1 4 2'): ");
		
		String input = sc.nextLine();
		String[] query =  input.split(" ");
		
		StackUsingArray stack = new StackUsingArray(100);
		
		for (int i=0;i<query.length;i++) {
			
			if(query[i].equals("1")) {
				
				int x = Integer.parseInt(query[i+1]); // read the next value
				stack.push(x);
				i++; // // Skip the next element since it was already used
			}else if(query[i].equals("2")) {
			     int poppedValue = stack.pop();
			     System.out.print(poppedValue + " "); // Output the popped value
			}
		}
		// End of program
        System.out.println("\nProgram finished.");
		sc.close();
	}

}
//Implement stack using array
//https://www.geeksforgeeks.org/problems/implement-stack-using-array/1?page=1&category=Arrays&difficulty=Basic&sortBy=submissions

/*
 * 
 * 
 * Write a program to implement a Stack using Array. Your task is to use the class as shown in the comments in the code editor and complete the functions push() and pop() to implement a stack. The push() method takes one argument, an integer 'x' to be pushed into the stack and pop() which returns an integer present at the top and popped out from the stack. If the stack is empty then return -1 from the pop() method.

Note: The input is given in form of queries. Since there are two operations push() and pop(), there is two types of queries as described below:
(i) 1 x   (a query of this type means  pushing 'x' into the stack)
(ii) 2     (a query of this type means to pop an element from the stack and print the popped element)
Input contains separated by space and as described above. 

Examples :

Input: 1 2 1 3 2 1 4 2 
Output: 3, 4
Explanation: 
push(2)    the stack will be {2}
push(3)    the stack will be {2 3}
pop()      poped element will be 3,
           the stack will be {2}
push(4)    the stack will be {2 4}
pop()      poped element will be 4
 * 
 * ===============
 * 
 * Peek (or sometimes called top) returns the value of the element currently at the top of the stack.

 * 
 * 
 */
