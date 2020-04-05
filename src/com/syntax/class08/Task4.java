package com.syntax.class08;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		/* ask for item they want to buy and price of item 
		 * bring in total amount of all items to purchase 
		 * 
		 * ask user for money 
		 * if less ask for more money and how much they need 
		 * if more give back the change 
		 * 
		 * after finish, " thanks for shopping 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Item");
		String item = scan.nextLine();
		
		System.out.println("Enter price of Item");
		int price = scan.nextInt();
		
		System.out.println("Enter money");
		int paid = scan.nextInt(); 
		
		int change = 0; 
		int more = 0;
		int add = 0; 
		
while(paid != price) 
	{	
		if(paid > price)
			{
				change = paid - price; 
				System.out.println("Your change is " + change); 
				break;
			}
			
		else 
			{
				more = price - paid; 
				System.out.println("Please pay additional " + more); 
				System.out.println("Enter addition amount ");
				add = scan.nextInt(); 
			}
		
		paid += add; 
	}
		
		System.out.println("Thank You For Shopping");
		System.out.println("==================================");
		
	}
	}


