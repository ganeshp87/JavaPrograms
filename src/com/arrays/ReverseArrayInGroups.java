package com.arrays;

import java.util.Arrays;

public class ReverseArrayInGroups {
	
	public static void main(String args[]) {
		
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		int k = 3;
		
		System.out.println(Arrays.toString(reverseArrayInGroups(arr1,k)));
		
		int[] arr2 = {1,2,3,4,5};
		int k2 = 5;
		
		System.out.println(Arrays.toString(reverseArrayInGroups(arr2,k2)));
	}
	
	public static int[] reverseArrayInGroups(int[] arr, int k) {
		
		int n = arr.length;
		
		for(int i=0;i<n;i=i+k) {
			
			int start = i;
			int end = Math.min(i+k-1, n-1);
			
			while(start<end) {
				
				int temp =arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				
				
				start++;
				end--;
			}
			
			
		}
		
		return arr;
	}

}

//https://www.geeksforgeeks.org/problems/reverse-array-in-groups0255/1?page=1&category=Arrays&difficulty=Basic&sortBy=submissions


