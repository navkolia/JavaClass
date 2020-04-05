package com.syntax.class04;

public class Review {

	public static void main(String[] args) {

		//Widening -> implicitly happens by compiler 
		/* if condition 
		 * - verification 
		 * -selectie execution 
		 * 
		 * int temp = 95; 
		 * if(temp > 95)
		 * { 
		 * System.out.println("it is super hot")
		
		 Nested if  
		 if(boolean expression)
		 	{ 
		 		code...
		 		if(boolean expression)
		 		{
		 			Code... 
		 		}
		 	}
		 */
		
		boolean flag = true; 
		boolean classToday = false; 
		
		if(flag) 
		{
			System.out.println("Hello");
			
			if(classToday) 
				{ System.out.println("Hello Friedns"); }
			else
				{  System.out.println("Hello  Family");  }
		}
		
		else 
		{  System.out.println("bye");  }
		
		System.out.println("I am outside of if condition");
		
		
		
		
	}
}
