package com.arrays;

public class FindElementAtGivenIndex {
	
	public static void main(String args[]) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int index = 2;
		
		System.out.println(findIndexValue(arr,index));
		
		int[] arr2 = {10, 20, 30, 40, 50, 60, 70};
		int index2 = 4;
		
		System.out.println(findIndexValue(arr2,index2));
	}

	private static int findIndexValue(int[] arr, int index) {
		
		for(int i=0;i<arr.length;i++) {
			
			if(i==index) {
				return arr[i];
				
			}
		}
		
		return -1;
	}

}

//https://www.geeksforgeeks.org/problems/c-array-print-an-element-set-25933/1?page=2&category=Arrays&difficulty=Basic&sortBy=submissions
