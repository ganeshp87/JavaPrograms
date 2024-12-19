package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FirstAndSecondSmallest {
	
	public static void main(String args[]) {
		
	
		int[] arr1 = {2, 4, 3, 5, 6};
		
		int[] result = findFirstAndSecondSmallest(arr1);
		System.out.println(Arrays.toString(result));
		
	    int[] arr2 = {5, 5, 5};
        int[] result2 = findFirstAndSecondSmallest(arr2);
        System.out.println(Arrays.toString(result2));  

        int[] arr3 = {10};
        int[] result3 = findFirstAndSecondSmallest(arr3);
        System.out.println(Arrays.toString(result3));  

        int[] arr4 = {};
        int[] result4 = findFirstAndSecondSmallest(arr4);
        System.out.println(Arrays.toString(result4));  
        
        int[] arr5 = {1,1,1};
        int[] result5 = findFirstAndSecondSmallest(arr5);
        System.out.println(Arrays.toString(result5));  
	
	}
	
	public static int[] findFirstAndSecondSmallest(int[] arr) {
		
		Set<Integer> uniqueNumbers = new HashSet<>();
		
		for(int num : arr) {
			
			uniqueNumbers.add(num);
		}
		
		if(uniqueNumbers.size()<2) {
			
		 return uniqueNumbers.size() == 1 ? new int[]{arr[0]} : new int[]{-1};
		}
		
		Integer[] sorted = uniqueNumbers.toArray(new Integer[0]);
		
		Arrays.sort(sorted);
		
		return new int[]{sorted[0], sorted[1]};
	}

}
