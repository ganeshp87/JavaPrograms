package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class ValueEqualToIndexValue {
	
	public static void main(String args[]) {
		
		int[] testCase1 = {15, 2, 45, 4 , 7, 6};
		int[] testCase2 = {1};
		
		 System.out.println(findValueEqualToIndex(testCase1));
		 System.out.println(findValueEqualToIndex(testCase2));
		
	}

	private static List<Integer> findValueEqualToIndex(int[] arr) {
		List<Integer> matchingIndices = new ArrayList<>();
		
		for(int i = 0; i<arr.length;i++) {
			
			if(arr[i]==i+1) {
				
				matchingIndices.add(arr[i]);
			}
		}
		return matchingIndices;
		
	}
	
}
