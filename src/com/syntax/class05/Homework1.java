package com.syntax.class05;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// 3 doubles, largest of the doubles 
		 
		Scanner number = new Scanner(System.in); 
		double largest; 
		
		System.out.println("First Number is?");
		double num1 = number.nextDouble(); 
		
		System.out.println("Second Number is?");
		double num2 = number.nextDouble(); 
		
		System.out.println("Third Number is?");
		double num3 = number.nextDouble(); 
		
		if(num1 > num2 && num1 > num3)
		{
			largest = num1; 
		}
		
		else if (num2 > num1 && num2>num3)
		{
			largest = num2; 
		}
		
		else 
		{
			largest = num3;
		}
		
		System.out.println("Largest Number is " + largest); 

	}

}
