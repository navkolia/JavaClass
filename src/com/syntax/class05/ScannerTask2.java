package com.syntax.class05;

import java.util.Scanner; 

public class ScannerTask2 {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.print("How long you are working with the company? ");
		int year = userInput.nextInt();
		
		if (year >= 5) 
		{
			System.out.print("What is your Annual Salary? ");
			double salary = userInput.nextDouble();
			
			System.out.println("You are eligible for Bonus!!");
			
				if (salary >= 100000) 
					{System.out.println("Your bonus amount is 10000.");} 
			
				else if (salary>=5000)
					{System.out.println("Your bonus amount is 5000.");}
		
				else 
					{System.out.println("Your bonus amount is 3000.");}
		} 
		
		else 
		{System.out.println("Sorry, You are not Eligible for Bonus untill you reach 5 year.");}
		
	}
	
}
		
