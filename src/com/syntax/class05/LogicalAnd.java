package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		
		/* 
		 * If declared # is 
		 * between 1-10 --> this number is small 
		 * between 11-100 --> this is big number 
		 * between 101 - 1000 --> this is large number 
		 */
		
		
		int num = 78; 
		
		if(num >= 1 && num <=10) 
		   { System.out.println("This number is small"); }
			
			else if (num >= 11 && num <=100) 
			{ System.out.println("This number is big"); }
			
			else if (num >= 101 && num <=1000) 
			{ System.out.println("This number is Bigger"); }
		
		else 
		{ System.out.println("THis Number is Biggest"); }
			
	}
	
}
