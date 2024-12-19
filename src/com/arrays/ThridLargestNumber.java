package com.arrays;

public class ThridLargestNumber {
	
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
	
	}

	private static int findThirdLargest(int[] arr) {
	
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
		
		for(int num : arr) {
			
			//Ignore duplicates
			if(num == first || num == second || num ==third) {
				continue;
			}
			
			if(num > first) {
				third = second;
				second = first;
				first = num;
				
			}else if(num > second) {
				third = second;
				second = num;
				
			}else if(num > third) {
				third = num;
			}
		}
		
		return third !=Integer.MIN_VALUE ? third: -1;
	}

}
