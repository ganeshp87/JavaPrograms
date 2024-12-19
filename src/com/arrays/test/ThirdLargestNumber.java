package com.arrays.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThirdLargestNumber {
	
	public static void main(String args[]) {
	    int[] arr = {10, 20, 4, 45, 99};
		
		System.out.println();
		
		System.out.println("The third largest number is :: " + findThirdLargest(arr));
		
		
	    int[] arr2 = {10, 2};
		
		System.out.println();
		
		System.out.println("The third largest number is :: " + findThirdLargest(arr2));
		
	    int[] arr3 = {5,5,5};
		
		System.out.println();
		
		System.out.println("The third largest number is :: " + findThirdLargest(arr3));
		
		
	    int[] arr4 = {8,5,5};
		
		System.out.println();
		
		System.out.println("The third largest number is :: " + findThirdLargest(arr4));
		
		
	}
	
	public static int findThirdLargest(int[] arr) {
		
		Set<Integer> uniqueNumbers = new HashSet<>();
		
		for(int num : arr) {
			uniqueNumbers.add(num);
		}
		
		if(uniqueNumbers.size()<3) {
			
			if(uniqueNumbers.size()==1) {
				
				return arr[0];
			}
			
			return -1;
		}
		
		Integer[] sorted = uniqueNumbers.toArray(new Integer[0]);
		
		 Arrays.sort(sorted,(a,b)-> b-a); //descending order
		//Arrays.sort(sorted); // this will sort the array in ascending order
		
		
		
		
		
		return sorted[1];
	}

}
