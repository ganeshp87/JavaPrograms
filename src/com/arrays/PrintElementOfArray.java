package com.arrays;

public class PrintElementOfArray {
	
	public static void main(String args[]) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		printArray(arr);
		
        int[] arr2 = {2, 3, 5, 5};
		
		printArray(arr2);
	}

	private static void printArray(int[] arr) {
		
		for(int num : arr) {
			
			System.out.print(num + " ");
		}
		System.out.println(" ");
	}

}

//https://www.geeksforgeeks.org/problems/print-elements-of-array4910/1?page=2&category=Arrays&difficulty=Basic&sortBy=submissions