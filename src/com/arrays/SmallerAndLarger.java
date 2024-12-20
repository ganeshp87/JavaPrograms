package com.arrays;

import java.util.Arrays;

public class SmallerAndLarger {
	
	public static void main(String args[]) {
		
		int[] arr = {1, 2, 8, 10, 11, 12, 19};
		int x=0;
		
		int[] result = findSmallerAndLarger(arr,x);
		System.out.println(Arrays.toString(result));
		
		
		int[] arr2 = {1, 5, 8, 12, 12, 12, 19, 20, 25, 26};
		int x2=12;
		
		int[] result2 = findSmallerAndLarger(arr2,x2);
		System.out.println(Arrays.toString(result2));
		
	}

	private static int[] findSmallerAndLarger(int[] arr, int x) {
		
		int smaller =0;
		int larger =0;
		
		for(int num : arr) {
			
			if(num<=x) {
				smaller ++;
			}else {
				larger ++;
			}
		}
		
		return new int[] {smaller,larger};
	}

}


















//https://www.geeksforgeeks.org/problems/smaller-and-larger4005/1?page=2&category=Arrays&difficulty=Basic&sortBy=submissions