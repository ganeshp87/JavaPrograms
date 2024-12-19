package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class AlternatesInAnArray {
	
	public static void main(String args[]) {
		
		int[] testCase1 = {1,2,3,4};
		int[] testCase2 = {1,2,3,4,5};
		
		System.out.println(findAlternateInArray(testCase1));
		System.out.println(findAlternateInArray(testCase2));
	}
	
	public static List<Integer> findAlternateInArray(int[] arr){
		
		List<Integer> alternateIndices = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			
			 alternateIndices.add(arr[i]);
			 ++i;
			
		}
		
		
		return alternateIndices; 
		
		
	}

}
//https://www.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1?page=1&category=Arrays&difficulty=Basic&sortBy=submissions