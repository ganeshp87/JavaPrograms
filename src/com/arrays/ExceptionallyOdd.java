package com.arrays;

public class ExceptionallyOdd {
	
	 public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 2, 3, 1, 3};
	        int[] arr2 = {5, 7, 2, 7, 5, 2, 5};

	        System.out.println("Exceptional number is: " + getOddOccurrence(arr1, arr1.length)); // Output: 3
	        System.out.println("Exceptional number is: " + getOddOccurrence(arr2, arr2.length)); // Output: 5
	    }

	    public static int getOddOccurrence(int[] arr, int n) {
	        int result = 0;

	        // XOR all elements
	        for (int num : arr) {
	            result ^= num;
	        }

	        // The result will be the number with odd occurrences
	        return result;
	    }
}

//https://www.geeksforgeeks.org/problems/find-the-odd-occurence4820/1?page=2&category=Arrays&difficulty=Basic&sortBy=submissions

/**
 * 
 * For example, consider the array 

{5,7,2,7,5,2,5}:

XORing 5, 7, 2, 7, 5, 2, and 5 will result in 5 as the answer, because the numbers 7 and 2 cancel each other out (since they appear twice, an even number of times).
 */
