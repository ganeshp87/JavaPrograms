package com.arrays;

public class ReplaceZerosWithFives {

	public static void main(String args[]) {
		
		int n = 1004;
		int n2 = 121;
		
		System.out.println(replaceZeroWithFives(n));
		System.out.println(replaceZeroWithFives(n2));
	}
	
	public static int replaceZeroWithFives(int num) {
	
	  String numToString = String.valueOf(num);
	  
	  String modifiedString = numToString.replace('0','5');
	  
	   return Integer.parseInt(modifiedString);
	
	}
	
}
//https://www.geeksforgeeks.org/problems/replace-all-0s-with-5/1?page=2&category=Arrays&difficulty=Basic&sortBy=submissions