package com.arrays;

public class SwapKthElements {
	

	public static void main(String[] args) {
		
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int k1 = 3;
        
        swapKthElements(arr1, k1);
        System.out.println(java.util.Arrays.toString(arr1)); // Output: [1, 2, 6, 4, 5, 3, 7, 8]

        int[] arr2 = {5, 3, 6, 1, 2};
        int k2 = 2;
        
        swapKthElements(arr2, k2);
        System.out.println(java.util.Arrays.toString(arr2)); // Output: [5, 1, 6, 3, 2]
    }

    public static void swapKthElements(int[] arr, int k) {
        int n = arr.length;

        // Ensure k is within valid bounds
        if (k > 0 && k <= n) {
            // Calculate the indices
            int startIdx = k - 1;  // 1-based to 0-based
            int endIdx = n - k;

            // Swap the elements
            int temp = arr[startIdx];
            arr[startIdx] = arr[endIdx];
            arr[endIdx] = temp;
        }
    }

}

//https://www.geeksforgeeks.org/problems/swap-kth-elements5500/1?page=2&category=Arrays&difficulty=Basic&sortBy=submissions