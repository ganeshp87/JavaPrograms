package com.arrays;

import java.util.Arrays;

public class ImmediateSmallerElement2 {
	
	public static void main(String args[]) {
		
		int[] testCase1 = {4,2,1,5,3};
		int[] testCase2 = {5, 6, 2, 3, 1, 7};
		int[] testCase3 = {4,1};
		
		System.out.println(Arrays.toString(findImmediateSmallerElement(testCase1)));
		System.out.println(Arrays.toString(findImmediateSmallerElement(testCase2)));
		System.out.println(Arrays.toString(findImmediateSmallerElement(testCase3)));
	}
	
	public static int[] findImmediateSmallerElement(int[] arr){
		
		int n =arr.length;
		
		int[] result = new int[n]; // Fixed size array
				
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]>arr[i+1]) {
				result[i] = arr[i+1];
			}else {
				result[i]=-1;
			}
			
		}
		result[n-1]=-1; // Last element is always -1
		
		return result;
	}

}

//https://www.geeksforgeeks.org/problems/immediate-smaller-element1142/1?page=1&category=Arrays&difficulty=Basic&sortBy=submissions
