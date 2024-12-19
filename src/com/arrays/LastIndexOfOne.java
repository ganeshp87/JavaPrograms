package com.arrays;

public class LastIndexOfOne {
	
	public static void main(String args[]) {
		
		
		String s1 = "00001";
        String s2 = "0";
        String s3 = "101010";

        System.out.println(findLastIndexOfOne(s1)); 
        System.out.println(findLastIndexOfOne(s2)); 
        System.out.println(findLastIndexOfOne(s3));
		
	}

	public static int findLastIndexOfOne(String s) {
		
		for(int i = s.length()-1; i>=0;i--) {
			
			if(s.charAt(i)=='1') {
				return i;
			}
		}
		
		return -1;
	}
}
