package com.arrays;

import java.util.HashSet;

public class ElementsInTheRange {
	
	public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 2, 7, 8, 3};
        System.out.println(checkElements(arr1, arr1.length, 2, 5)); // Output: true

        int[] arr2 = {1, 4, 5, 2, 7, 8, 3};
        System.out.println(checkElements(arr2, arr2.length, 2, 6)); // Output: false
    }

    public static boolean checkElements(int[] arr, int n, int A, int B) {
        // Step 1: Store all array elements in a set
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Step 2: Check if all elements in the range [A, B] exist in the set
        for (int i = A; i <= B; i++) {
            if (!set.contains(i)) {
                return false; // Return false if any element is missing
            }
        }

        return true; // All elements found
    }
}

//https://www.geeksforgeeks.org/problems/elements-in-the-range2834/1?page=2&category=Arrays&difficulty=Basic&sortBy=submissions