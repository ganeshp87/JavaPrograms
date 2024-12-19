package com.arrays;

import java.util.Arrays;

public class FindMinAndMax2 {
	
	public static void main(String args[]) {
		
		int[] a1 = {23,11,45,65,76,90,100,1};
		
		System.out.println(Arrays.toString(findMinAndMaxNumber(a1)));
		
	}

	private static int[] findMinAndMaxNumber(int[] arr) {
		
		if(arr.length < 2) {
			
			System.out.println("Atleast two number is required to find the min and max");
			//return null;
			throw new IllegalArgumentException();
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int num : arr) {
			
		   if(num < min) {
			   min =num;
		   }
		   
		   if(num > max) {
			   
			   max = num;
		   }
			
		}
		
		 System.out.println("The minimum number is " + min + " and the maximum number is " + max);
		
		
		
		return new int[] {min,max};
	}
	

}
//This is not an efficient way of doing using sorting.
