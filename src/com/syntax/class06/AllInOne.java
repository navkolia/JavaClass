package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		/*
		 * write a program to ask user if there is a sale ? 
		 * no sale --> not going shopping 
		 * is sale --> we will ask price of item 
		 * based on the price we will apply discount and calculate final price 
		 * 
		 * if price is < 20 --> 10% off 
		 * price between 20 -100 --> 20% 
		 * 100- 500 --> 30% 
		 * 500+ --> 50% 
		 * after discount the price is reduced from --- to --- 
		 * 
		 */
		
		Scanner ans = new Scanner(System.in);
		System.out.println("Is there a sale?");
		String text = ans.next(); 
		
	if (text.equalsIgnoreCase("yes")) 
		{
			Scanner sale = new Scanner(System.in);
			System.out.println("what is the price of the item"); 
			double price = sale.nextDouble(); 
			double finalPrice;
			
			if(price < 20) 
			{ finalPrice = price * .9; }
			else if (price >= 20 && price < 100)
			{ finalPrice = price * .8; } 
			else if ( price >= 100 && price <500)
			{ finalPrice = price * .7; } 
			else 
			{ finalPrice = price * .5; } 
			
			System.out.println("After discount the price is reduced from "+ price + " to " + finalPrice); 
				
		}
	
	else 
		{
			System.out.println("Not going Shopping"); 
		}

	}
}
