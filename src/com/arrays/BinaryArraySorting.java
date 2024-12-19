package com.arrays;

import java.util.Arrays;

public class BinaryArraySorting {
	
	public static void main(String args[]) {
		
		int[] arr1 = {1,0,1,1,0};
		System.out.println(Arrays.toString(findBinaryArraySorting(arr1)));
		//printArray(arr1);
		System.out.println(" ");
		
		int[] arr2 = {1, 0, 1, 1, 1, 1, 1, 0, 0, 0};
		System.out.println(Arrays.toString(findBinaryArraySorting(arr2)));
		
	}

	public static int[] findBinaryArraySorting(int[] arr) {
		
		int count =0;
		
		for(int num : arr) {
			
			if(num == 0) {
				count ++;
			}
		}
		
		System.out.println("Number of Zeros: " + count);
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(i<count) {
				arr[i]=0;
			}
			else {
				arr[i]=1;
			}
		}
		
		return arr;
	}
	
	private static void printArray(int[] arr) {
		
		for(int num : arr) {
			
			System.out.print(num + " ");
		}
		
	}

}
//https://www.geeksforgeeks.org/problems/binary-array-sorting-1587115620/1?page=1&category=Arrays&difficulty=Basic&sortBy=submissions
