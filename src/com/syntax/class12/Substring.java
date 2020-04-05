package com.syntax.class12;

public class Substring {

	public static void main(String[] args) {
	
	// get a string from a string, just ask for index where you want to take out the string 
		
		String string1  = "Today is a rainy day.";
		
		String partial = string1.substring(6); //is a rainy day, index 6 to end of string 
		System.out.println(partial); 

	// can indicate starting and ending index to get the string from 
		
		String part = string1.substring(0, 5);  //today, index 0 to 5 
		System.out.println(part);
		
	}

}
