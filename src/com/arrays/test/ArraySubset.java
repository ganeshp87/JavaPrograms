package com.arrays.test;

import java.util.HashMap;

public class ArraySubset {
	
	public static void main(String args[]) {
		
		int[] a = {11,7,1,13,21,3,7,3};
		int[] b = {11,3,7,1,7};
		
		System.out.println(findArraySubset(a,b));
		
	}
	
	public static String findArraySubset(int[] arr1, int[]arr2) {
		
		HashMap<Integer,Integer> frequencyMap = new HashMap<>();
		
		for(int num : arr1) {
			
			frequencyMap.put(num,frequencyMap.getOrDefault(num, 0)+1);
			
		}
		
		for(int num : arr2) {
			
			if(!frequencyMap.containsKey(num) || frequencyMap.get(num)==0) {
				return "NO";
			}
			
			frequencyMap.put(num, frequencyMap.get(num)-1);
			
		}
		
		return "Yes";
		
	}

}
