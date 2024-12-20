package com.arrays;

public class DisplayLongestName {
	
	public static void main(String args[]) {
		
		
	  String[] names = {"Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"};
	
	  String result = displayLongestName(names);
	  
	  System.out.println(result);
	  
	  String[] names2 = {"Apple", "Mango", "Orange", "Banana"};
		
	  String result2 = displayLongestName(names2);
	  
	  System.out.println(result2);
	
	}
	
	public static String displayLongestName(String[] names) {
		
		  String longestName = "";
		  int maxLength=0;
		  
		  for(String name : names) {
			  
			  if(name.length()>maxLength) {
				  
				  longestName = name;
				  maxLength = name.length();
				  
			  }
		  }
		
		return longestName;
	}

}

//https://www.geeksforgeeks.org/problems/display-longest-name0853/1?page=2&category=Arrays&difficulty=Basic&sortBy=submissions
