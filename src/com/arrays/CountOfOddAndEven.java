package com.arrays;

import java.util.Arrays;

public class CountOfOddAndEven {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int[] arr2 = {1,1};
		
		 int[] result = findOddEven(arr) ;
		 System.out.println(Arrays.toString(result));
		 
		 int[] result2 = findOddEven(arr2) ;
		 System.out.println(Arrays.toString(result2));
	}

	public static int[] findOddEven(int[] arr) {
		
		int oddCount = 0;
		int evenCount =0;
		
		for(int num: arr) {
			
			if(num%2!=0) {
				oddCount++;
			}else {
				evenCount ++;
			}
		}
		
		return new int[] {oddCount,evenCount};
	}
	
}

//https://www.geeksforgeeks.org/problems/count-odd-even/1?page=2&category=Arrays&difficulty=Basic&sortBy=submissions
