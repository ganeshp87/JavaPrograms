package com.arrays;

import java.util.Arrays;

public class FindMinAndMax {
	
	public static void main(String args[]) {
		
		int[] a1 = {23,11,45,65,76,90,100,1};
		
		findMinAndMaxNumber(a1);
		
	}

	private static int[] findMinAndMaxNumber(int[] arr) {
		
		if(arr.length < 2) {
			
			System.out.println("Atleast two number is required to find the min and max");
			//return null;
			throw new IllegalArgumentException();
		}
		
		Arrays.sort(arr);
		System.out.println("The minium and maximum number is " + arr[0] + "," + (arr[arr.length-1]));
		
		return arr;
	}
	

}
//This is not an efficient way of doing using sorting.
