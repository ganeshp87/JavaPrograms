package com.arrays;

public class PalindromeArray {
	
 public static void main (String args[]) {
	
	int[] arr1 = {1, 2, 3, 2, 1};
    int[] arr2 = {1, 2, 3, 4, 5};

    System.out.println(isPalindrome(arr1)); // Output: true
    System.out.println(isPalindrome(arr2)); // Output: false
}

private static boolean isPalindrome(int[] arr) {
	
	int start =0;    // pointer at the beginning
	int end =arr.length-1;  // pointer at the end
	
	while (start < end) {
		
		if(arr[start] != arr[end]) {
			
			return false;
		}
		
		start ++;
		end --;
		
	}
	return true;
   }
	
}

//https://www.geeksforgeeks.org/problems/perfect-arrays4645/1?page=2&category=Arrays&difficulty=Basic&sortBy=submissions
