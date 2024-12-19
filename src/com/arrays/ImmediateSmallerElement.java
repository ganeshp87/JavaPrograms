package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class ImmediateSmallerElement {
	
	public static void main(String args[]) {
		
		int[] testCase1 = {4,2,1,5,3};
		int[] testCase2 = {5, 6, 2, 3, 1, 7};
		int[] testCase3 = {4,1};
		
		System.out.println(findImmediateSmallerElement(testCase1));
		System.out.println(findImmediateSmallerElement(testCase2));
		System.out.println(findImmediateSmallerElement(testCase3));
	}
	
	public static List<Integer> findImmediateSmallerElement(int[] arr){
		
		List<Integer> smallerIndeces = new ArrayList<>();
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]>arr[i+1]) {
				smallerIndeces.add(arr[i+1]);
			}else {
				smallerIndeces.add(-1);
			}
			
		}
		smallerIndeces.add(-1);
		
		return smallerIndeces;
	}

}

//https://www.geeksforgeeks.org/problems/immediate-smaller-element1142/1?page=1&category=Arrays&difficulty=Basic&sortBy=submissions
