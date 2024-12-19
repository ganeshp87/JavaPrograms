package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThridLargestNumber2 {
	
	public static void main(String args[]) {
    int[] arr = {10, 20, 4, 45, 99};
	
	System.out.println();
	
	System.out.println("The third largest number is :: " + findThirdLargest(arr));
	
	
    int[] arr2 = {10, 2};
	
	System.out.println();
	
	System.out.println("The third largest number is :: " + findThirdLargest(arr2));
	
    int[] arr3 = {5,5,5};
	
	System.out.println();
	
	System.out.println("The third largest number is :: " + findThirdLargest(arr3));
	
	
   int[] arr4 = {8,5,5};
	
	System.out.println();
	
	System.out.println("The third largest number is :: " + findThirdLargest(arr4));
	
	
	}

	private static int findThirdLargest(int[] arr) {
        // Step 1: Use a set to remove duplicates and store unique elements
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : arr) {
            uniqueElements.add(num);
        }

        // Step 2: If fewer than 3 distinct elements, return -1
        if (uniqueElements.size() < 3) {
            // Check if there are multiple occurrences of the same number
            if (uniqueElements.size() == 1) {
                return arr[0];  // Only one distinct number, return it as the third largest
            }
            return -1;  // If there are fewer than 3 distinct elements
        }

        // Step 3: Sort the unique elements in descending order
        Integer[] sorted = uniqueElements.toArray(new Integer[0]); // converting collections to array
        Arrays.sort(sorted, (a, b) -> b - a);  // Sort in descending order

        // Step 4: Return the third largest distinct element
        return sorted[2];
    }
}
