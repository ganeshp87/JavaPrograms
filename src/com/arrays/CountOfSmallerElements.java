package com.arrays;

public class CountOfSmallerElements {
	
	public static void main(String args[]) {
		
		int[] arr = {10, 1, 2, 8, 4, 5};
		int x = 9;
		
		int[] arr2 = {1, 2, 2, 5, 7, 2, 9};
		int x2 = 4;
		
		int result = findCountOfSmallerElements(arr,x);
		
		int result2 = findCountOfSmallerElements(arr2,x2);
		
		System.out.println("Result:: " + result);
		System.out.println("Result:: " + result2);
		
				
	}
	
	public static int findCountOfSmallerElements(int[] arr, int x) {
		
		int count=0;
		
		for(int num : arr) {
			
			if(num <= x) {
				count ++;
			}
		}
		
		
		return count;
	}

}

//https://www.geeksforgeeks.org/problems/count-of-smaller-elements5947/1?page=2&category=Arrays&difficulty=Basic&sortBy=submissions
