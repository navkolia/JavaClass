package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		/*Declare date and a day 
		 first condition  --> If day is friday -> if date is 13th -> watch a scary movie 
		 				                       -> if date is not 13th -> watch a comedy 
		 */
		
		boolean isFriday = true; 
		int date = 14; 
		
		if(isFriday) 
			
				{
			
				System.out.println("Today is friday, I am going to a movie"); 
			
					if(date ==13) 
						{  System.out.println("I'll watch scary movie");  }
				
					else	 
						{  System.out.println("I'll watch a comedy");  }
				
				}
		
		else 
			{ System.out.println("Today is not Friday, I am staying home"); }

	}

}
