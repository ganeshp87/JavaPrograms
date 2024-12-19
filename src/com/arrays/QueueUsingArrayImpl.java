package com.arrays;

import java.util.Scanner;

public class QueueUsingArrayImpl {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the queries for the stack operations (e.g., '1 2 1 3 2 1 4 2'): ");
		
		String input = sc.nextLine();
		String[] query =  input.split(" ");
		
		QueueUsingArray queue = new QueueUsingArray(100);
		
		for (int i=0;i<query.length;i++) {
			
			if(query[i].equals("1")) {
				
				int x = Integer.parseInt(query[i+1]); // read the next value
				queue.push(x);
				i++; // // Skip the next element since it was already used
			}else if(query[i].equals("2")) {
			     int poppedValue = queue.pop();
			     System.out.print(poppedValue + " "); // Output the popped value
			}
		}
		// End of program
       System.out.println("\nProgram finished.");
		sc.close();
	}


}

//https://www.geeksforgeeks.org/problems/implement-queue-using-array/1?page=1&category=Arrays&difficulty=Basic&sortBy=submissions

/**
 * 
 * Implement a Queue using an Array. Queries in the Queue are of the following type:
(i) 1 x   (a query of this type means  pushing 'x' into the queue)
(ii) 2     (a query of this type means to pop an element from the queue and print the popped element. If the queue is empty then return -1)

We just have to implement the functions push and pop and the driver code will handle the output.

Examples:

Input: Queries = 1 2 1 3 2 1 4 2
Output: 2 3
Explanation: For query 1 2 the queue will be {2} 1 3 the queue will be {2 3} 2   poped element will be 2 the queue will be {3} 1 4 the queue will be {3 4} 2 poped element will be 3 
Input: Queries = 1 3 2 2 1 4   
Output: 3 -1
Explanation: For query 1 3 the queue will be {3} 2 poped element will be 3 the queue will be empty 2 there is no element in the queue and hence -1 1 4 the queue will be {4}. 
Input: Queries = 1 3 2 2 1 3   
Output: 3 -1
Explanation: For query 1 3 the queue will be {3} 2 poped element will be 3 the queue will be empty 2 there is no element in the queue and hence -1 1 3 the queue will be {3} and hence -1 1 3 the queue will be {3}.
 * 
 **/

