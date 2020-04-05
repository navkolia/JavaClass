package com.syntax.class08;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {
		// ask to pay for candy, continually ask till get $2
		
		Scanner s = new Scanner(System.in);
		double price;
		
		do
		{
			System.out.println("Please Pay for Candy");
			price = s.nextDouble();
		}
		while(price!=2);
		
		System.out.println("Enjoy Your Candy!");
		
		
		
		System.out.println("----------------------------------");
	
	
		Scanner z = new Scanner(System.in);
		System.out.println("Please Pay for Candy");
		double price1 = z.nextDouble();
			
		while(price1!=2)
		{
			System.out.println("Please Pay for Candy");
			price1 = z.nextDouble();
		}
		System.out.println("Enjoy Your Candy!");
		System.out.println("----------------------------------");
	
	
	
	}
}


