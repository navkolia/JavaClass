package com.syntax.class06;

import java.util.Scanner;

public class SwitchHW {

	public static void main(String[] args) {
		/*
		 * user enter 2 # and a math operator
		 * perfor operator and give result 
		 */

		Scanner math = new Scanner(System.in);
		double result = 0; 
		
		System.out.println("Enter 1st number");
		int num1 = math.nextInt();
		
		System.out.println("Enter 2nd Number"); 
		int num2 = math.nextInt(); 
		
		System.out.println("Enter operator"); 
		String operator = math.next(); 
		
		switch(operator)
		{
		case "*":
			result = num1 * num2; 
			break;
			
		case "/":
			result = num1 / num2; 
			break;
			
		case "-":
			result = num1 - num2; 
			break;
			
		case "+":
			result = num1 + num2; 
			break;
			
			default: 
			System.out.println("N/A"); 
		}
		System.out.println(result); 	
	}
}
