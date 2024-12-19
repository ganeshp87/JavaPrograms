package com.arrays;

public class SumOfArray {
	
	public static void main(String args[]) {
		
		int[] arr = {1,2,3,4};
		
		System.out.println(findSumOfArray(arr));
		
        int[] arr2 = {1, 3, 3};
		
		System.out.println(findSumOfArray(arr2));
		
	}
	
	
	public static int findSumOfArray(int[] arr) {
		
		int sum =0;
		
		for(int num: arr) {
			
			sum = sum + num;
			
		}
		
		
		return sum;
	}
}

//https://www.geeksforgeeks.org/problems/sum-of-array2326/1?page=1&category=Arrays&difficulty=Basic&sortBy=submissions