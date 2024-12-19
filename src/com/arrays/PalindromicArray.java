package com.arrays;

public class PalindromicArray {
	
	public static void main(String args[]) {
		
		int[] arr1 = {111, 222, 333, 444, 555};
		int[] arr2 = {121, 131, 20};
		
		System.out.println(findPalindromicArray(arr1));
		System.out.println(findPalindromicArray(arr2));
	}
	
	public static boolean findPalindromicArray(int[] arr) {
		
		for (int num : arr) {
            if (!isPalindrome(num)) {
                return false;
            }
        }
        return true; 
	}

	private static boolean isPalindrome(int num) {
		
		int originalNumber = num;
		int reversed = 0;
		
		while(num>0) {
			int digit = num%10;
			reversed = reversed * 10 + digit;
			num = num/10;
		}
		return originalNumber==reversed;		
	}

}

//https://www.geeksforgeeks.org/problems/palindromic-array-1587115620/1?page=1&category=Arrays&difficulty=Basic&sortBy=submissions