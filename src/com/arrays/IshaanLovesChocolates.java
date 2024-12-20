package com.arrays;

public class IshaanLovesChocolates {
	
	public static void main(String args[]) {
		
	     int[] arr1 = {5, 3, 1, 6, 9};
	     
	     System.out.println(chocolates(arr1));
		
	}

	private static int chocolates(int[] arr) {
		
		int start =0;
		int end = arr.length-1;
		
		while(start < end) {
			
			if(arr[start] >= arr[end]) {
				start ++;
				
			}else {
				arr[end]--;
			}
		}
		
		return arr[start];
	}

}
//https://www.geeksforgeeks.org/problems/ishaan-loves-chocolates2156/1?page=2&category=Arrays&difficulty=Basic&sortBy=submissions
