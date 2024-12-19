package com.arrays.test;

import java.util.Arrays;

public class ReverseArraySubset {

	public static void main(String args[]) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int k = 3;
		
		System.out.println(Arrays.toString(reverseArraySubsets(arr,k)));
		
		int[] arr2 = {1,2,3};
		int k2 = 6;
		
		System.out.println(Arrays.toString(reverseArraySubsets(arr2,k2)));
		
		
	}
	
	public static int[] reverseArraySubsets(int[]arr, int k) {
		
		int n = arr.length;
		
		for(int i=0;i<n-1;i+=k) {
			
			int start = i;
			int end = Math.min(i+k-1, n-1);
				
			while (start<end) {
				
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				
				start++;
				end--;
			
			}
				
		}
		
		return arr;
	} 
	
}