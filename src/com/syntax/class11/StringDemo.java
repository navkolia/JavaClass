package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {
		
		String string1 =" Syntax ";						//create string 1 way 1
		String string2 = new String("Hello");   		// creating sting way 2 
		
		System.out.println(string1);
		System.out.println(string2); 
		
		string1 = " Syntax class "; 						//reassigning string value 
		
		System.out.println(string1); 
		
		System.out.println(string1.length());  			//#characters in string, includes space
		
		System.out.println(string1.toUpperCase());		//convert string to upper case
		System.out.println(string1.toLowerCase());		//convert string to lower case
		
		System.out.println(string1.concat(" is everyday")); 	//add to a string, must be string - string, otherwise use +
		System.out.println(string1.concat(string2)); 			// add one string to another
		
		String string3 = ""; 
		System.out.println(string3.isEmpty());			//asks if string is empty, return T/F
		System.out.println(string1.isEmpty()); 
		
		
		System.out.println(string1);				//trim eliminates space at beginning and end of string
		System.out.println(string1.trim());
		
		string1 = "welcomes syntax students";
		string2 = "welcomes Syntax students";
		
		System.out.println(string1.equals(string2)); 			//one string equals another - t/f 
		System.out.println(string1.equalsIgnoreCase(string2));  //ignores case to compare strings 
		
		
		
		
		
	}

}
