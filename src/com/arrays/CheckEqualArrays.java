package com.arrays;

import java.util.HashMap;

public class CheckEqualArrays {
	
	public static void main(String args[]) {
		
		int[] a1 = {1,2,5,4,0};
		int[] a2 = {2,4,5,0,1};
		
		System.out.println(findEqualArrys(a1,a2));
		
		int[] b1 = {1,2,5};
		int[] b2 = {2,4,15};
		
		System.out.println(findEqualArrys(b1,b2));
		
	}
	
	private static boolean findEqualArrys(int[] arr1, int[] arr2) {
		
		if(arr1.length != arr2.length) {
			return false;
		}
		
		HashMap<Integer,Integer> frequencyMap = new HashMap<>();
		
		for(int num : arr1) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);
		}
		
		for(int num :arr2) {
			
			if(!frequencyMap.containsKey(num)||frequencyMap.get(num)==0) {
				return false;
			}
			
			frequencyMap.put(num,frequencyMap.get(num)-1);
		}
		
		return true;
	}

}
