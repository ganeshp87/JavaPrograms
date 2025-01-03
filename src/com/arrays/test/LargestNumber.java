package com.arrays.test;

public class LargestNumber {
	
	public static void main(String args[]) {
		
		int[] arr = {25,36,98,54,21};
		
		System.out.println(findLargestNumber(arr));
	}
	
	
	public static int findLargestNumber(int[] arr) {
		
		int largest = arr[0];
		
		for (int num : arr) {
			
			if(num > largest) {
				
				largest = num;
			}
		}
		
		return largest;
		
	}

	
}
