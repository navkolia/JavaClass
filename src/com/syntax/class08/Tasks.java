package com.syntax.class08;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		// Prin # 1-50 except ones divisible by 3 
		
		for(int i =1; i<=50; i++)
		{
			if(i%3==0)
			{ continue; }
			
			System.out.print(i+ " ");
		}
		
System.out.println("-----------------------------");

		//ask user to apply for credit card 10 times, once you get yes, stop asking 
		
		Scanner scan = new Scanner(System.in);
		
		for(int i =1; i<=10; i++)
		{
			System.out.print("Do you want to apply for credit card");
			String text = scan.next(); 
			if(text.equals("yes"))
			{
				System.out.println("Congratulation!");
				break; 
			}
			}
		}
		
	}
