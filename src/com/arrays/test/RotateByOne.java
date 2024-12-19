package com.arrays.test;

import java.util.Arrays;

public class RotateByOne {
	
	public static void main(String args[]) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		rotateArrayByOne(arr);
	}
	
	public static void rotateArrayByOne(int[] arr) {
		
		int n = arr.length;
		int last = arr[n-1];
		
		if(n<2) {
			
			System.out.println("Aleast 2 numbers is required");
			throw new IllegalArgumentException();
		}
		
		for(int i = n-1;i>0;i--) {
			arr[i] = arr[i-1];
		}
		
		arr[0]=last;
		
		System.out.println(Arrays.toString(arr));
		
	}

}

