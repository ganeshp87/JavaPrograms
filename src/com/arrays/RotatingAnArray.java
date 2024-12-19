package com.arrays;

import java.util.Arrays;

public class RotatingAnArray {
	
	public static void main(String args[]) {
		
		int[] arr = {-1, -2, -3, 4, 5, 6, 7};
		int d = 2;
		rotateArray(arr, d);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
        
        int[] arr2 = {1, 3, 4, 2};
        int d2 = 3;
        rotateArray(arr2, d2);
        System.out.println("Rotated Array: " + Arrays.toString(arr2));
	}

	private static void rotateArray(int[] arr, int d) {

		int n = arr.length;
		
		if(n == 0 || d == 0 ||d == n ) {
			
			return; // no rotation needed
			
		}
		
		d = d % n;  // handle cases where d > n ex: arr.length = 7 and k = 2 :: answer is d%n =2
		
		                        //ex. original array: [1,2 3, 4, 5, 6, 7]
		reverse(arr, 0, d-1); // reverse the first d elements //[2, 1, 3, 4, 5, 6, 7].
		
		reverse(arr,d,n-1); // reverse remaining half: [2, 1, 7, 6, 5, 4, 3].
		
		reverse(arr,0,n-1);  // reverse full array: [3, 4, 5, 6, 7, 1, 2]
		
	}

	private static void reverse(int[] arr, int start, int end) {
		
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end]=temp;
			
			start ++;
			end --;
		}
	}

}
//https://www.geeksforgeeks.org/problems/reversal-algorithm5340/1?page=1&category=Arrays&difficulty=Basic&sortBy=submissions
