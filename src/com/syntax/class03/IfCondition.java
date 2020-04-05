package com.syntax.class03;

public class IfCondition {

	public static void main(String[] args) {
		/* Declare a number and compare if number is larger than 100 
		 * if number is larger than 100 --> my number is large 
		 */

		System.out.println("Starting Coding");
		
		int num = 178; 
		if(num > 100) 
		{  
		// if this statement is true than the block will be printed, if not, it will not be printed 
			System.out.println("My Number is Large"); 
		}
		
		System.out.println("End Of the Program");
		
		System.out.println("----------------");
		
		int expectedHours = 15; 
		int actualHours = 155; 
		
		// if actual is more than expected --> you will love java 
		// if actual is not more than expected nothing will be written
		// adding else will create avenue for something to happen with false 
		// true -> go inside if block
		// false -> go inside else block 
		
		
		if(actualHours >= expectedHours) 
			{
			System.out.println("You Will Love Java"); 
			System.out.println("I Study to much");

			}
		
		else{
			System.out.println("You Will Not Like Java");
			System.out.println("I don't study enough");

			}
		
		System.out.println("Code after if condition");
		
		
		
		/* 
		 * if is used to perform verification and 
		 * using if we are doing selective execution
		 */
		
		System.out.println("--------------------------"); 
		
		double budget = 100000; 
		double carPrice = 12000; 
		
		if(budget > carPrice) 
		{
			System.out.println("I will buy this car"); 
		}
		else
		{
			System.out.println("I will not buy this car"); 
		}
		
		System.out.println("Code after all conditions");
		
		

		
	}
}
