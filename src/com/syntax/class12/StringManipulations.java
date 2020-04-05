package com.syntax.class12;

public class StringManipulations {

	public static void main(String[] args) {
	
		String str = "Good Morning Students!"; 
		
		
	// charAT - get the character at the indicated index 
		
		char x = str.charAt(0); 
		System.out.println(x); 
		
		char y; 
		for(int i =0; i < str.length(); i++)
		{
			y = str.charAt(i); 
			System.out.print(y + " ");
		}
		
		System.out.println(); 
		System.out.println("-----------------");
		
	// indexOf(); -- give character and get the index of 1st occurring character
		// non exsisting character returns -1 
		
		int index = str.indexOf("M"); 
		System.out.println(index); 
		
		index = str.indexOf("Students"); 
		System.out.println(index); 

		
		
		
	}

}
