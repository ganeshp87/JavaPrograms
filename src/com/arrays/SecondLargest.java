package com.arrays;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String args[]) {
		
        int[] arr = {10, 20, 4, 45, 99};
		
		System.out.println();
		
		System.out.println("The second largest number is :: " + findSecondLargest(arr));
	}
	
	
	public static int findSecondLargest(int[] arr) {
		
		System.out.println("The original array:: " + Arrays.toString(arr));
		
		if(arr.length<2) {
			
			System.out.println("The array must be more than 2 numbers");
			
			//throw new IllegalArgumentException("The array must be more than 2 numbers");
			return Integer.MIN_VALUE;
		}
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		
		for(int num : arr) {
			
			if(num > largest) {
				
				secondLargest = largest;
				largest = num;
				
			}else if(num > secondLargest && num !=largest) {
				secondLargest = num;
			}
			
		}
		
		return secondLargest;
	}

}
