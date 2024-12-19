package com.arrays;
public class FindLargestInTwoArrays {
	
	public static void main(String args[]) {
		
		int [] a1 = {11,42,36,95,74};
		
		int[] a2 = {22,36,96,58,45,15,27,125};
		
		findLargestInTwoArrays(a1,a2);
	}

	public static void findLargestInTwoArrays(int[] arr1, int[] arr2) {
		
		int largest_A = findBiggerNumber(arr1);
		int largest_B = findBiggerNumber(arr2);
		
		
		System.out.println("Largest number in the array1:: " + largest_A);
		System.out.println("Largest number in the array2:: " + largest_B);
		
		int largest = Math.max(largest_A, largest_B);
		
		System.out.println("The largest number between two array is :: " + largest);
		
	}

	private static int findBiggerNumber(int[] arr) {
		
		int largest = arr[0];
		
		for(int num:arr) {
			
			if(num > largest)
				  largest = num;
		}

		return largest;
	}
	
}
