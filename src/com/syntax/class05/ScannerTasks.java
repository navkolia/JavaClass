package com.syntax.class05;

import java.util.Scanner;

public class ScannerTasks {
	
	public static void main(String[] args) 
	
	{
	
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("Do you have a credit card? "); 
		boolean answer = scan.nextBoolean(); 
		
		if(answer)
		{
			System.out.print("what is the current balance of your credit card?");
			double c = scan.nextDouble();
			
			if(c>1000) 
			{ System.out.println("please pay off your dues immediately"); }
			
			else
			{ System.out.println("Please spend more to get higher credit limit"); }
		}	
			else 
			{ System.out.println("we have a great credit card offer for you. are you interested?"); }
		
		
			
	}

}
