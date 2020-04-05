package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.println("Enter date?"); 
		int date = num.nextInt(); 
		
		if (date >= 1 && date <=5) 
		{System.out.println("Weekday");}
		
		else if (date >= 6 && date <=7) 
		{System.out.println("Weekend");}
		
		else 
		{System.out.println("INvalid");}
			
	}

}
