package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogic {

	public static void main(String[] args) {
/* take age input 
 * print output 
 * 0-3 --> baby 
 * 4-5 --. kid 
 * 5-12--> child 
 * 13-19 --> teen 
 * 20- 64 --> adult 
 * 64+ --> senior 
 * 
 */
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your age?"); 
		int age = scan.nextInt(); 
		
		if (age>0) 
		{
			if(age<3)
			{ System.out.println("Baby"); }
			
			else if(age >=3 && age<5)
			{System.out.println("kid"); }
			
			else if(age >=6 && age<=12)
			{System.out.println("child"); }
			
			else if(age >=13 && age<=19)
			{System.out.println("teen"); }
			 
			else if(age >=20 && age<=64)
			{System.out.println("adult"); }
			
			else if(age >=65)
			{System.out.println("senior"); }
		}
		
		else 
		{ System.out.println("Invalid Age"); }
		
		}
	}

