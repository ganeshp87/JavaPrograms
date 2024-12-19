package com.arrays;

public class FindLargestNumber {

	
	public static void main(String args[]) {
		
		int[] arr1= {25,35,89,1,65,93,22,34,74};
		
		System.out.println(findLargestNumber(arr1));
		
	}
	
	public static int findLargestNumber(int[] arr) {
		
		if(arr.length ==0) {
			return -1;
		}
		
		int largest= arr[0];
		
		for(int i=1; i<arr.length; i++) {
			
			if(arr[i]>largest) {
				largest= arr[i];
			}
		}
		
		return largest;
		
	}
	

}
