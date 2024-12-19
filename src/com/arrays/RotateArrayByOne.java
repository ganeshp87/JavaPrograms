package com.arrays;

public class RotateArrayByOne {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		System.out.println("Print the original array:: ");
		//printArray(arr);
		
		System.out.println("Roate the array by one:: ");
		rotateArrayByOne(arr);
		
		printArray(arr);
		
		
	}
	
	public static void rotateArrayByOne(int[] arr) {
		
		int n = arr.length;
		
		System.out.println("Value of n " + n);
		
		int last = arr[n-1];
		
		if(n<=1)
			return;
		
		for(int i=n-1;i>0;i--) {
			
			arr[i] = arr[i-1];
			
		}
		
		arr[0] = last;
		
		
	}
	

	private static void printArray(int[] arr) {
		
		for(int num: arr) {
			
	     System.out.print(num + " ");
		}
		
		System.out.println("");
	}

}
