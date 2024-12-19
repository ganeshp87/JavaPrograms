package com.arrays;

public class SearchingANumber {
	
	public static void main(String args[]) {
		
		int[] arr1 = {9,7,16,16,4};
		int k = 16;
		System.out.println("Position of 16: " + searchFirstOccurrence(arr1, k));
		
		int[] arr2= {1, 22, 57, 47, 34, 18, 66};
		int k2 = 98;
		System.out.println("Position of 98: " + searchFirstOccurrence(arr2, k2));
		
	}
	
	public static int searchFirstOccurrence(int[] arr, int k) {
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] == k) {
				return i+1;
			}
		}
		
		return -1;
	}

}
