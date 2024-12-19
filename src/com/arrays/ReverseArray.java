package com.arrays;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String args[]) {
		
		int[] arr = {34,56,23,87,90};
		
		reverseArray(arr);
		
		System.out.println("Reversed Array: " + Arrays.toString(arr));
	}

	private static void reverseArray(int[] arr) {
		
		int left =0;
		int right = arr.length-1;
		
		while (left < right) {
			
			int temp = arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			
			left++;
			right --;
			
		}
	}

}
