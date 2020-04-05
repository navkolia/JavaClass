package com.syntax.class04;

import java.util.Scanner;

public class ScannerExamples {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan = new Scanner(System.in);
		
		//instruct user of what program expects 
		System.out.println("Please enter Your Name");
		
		// capture line of strings form a user
		String name = scan.nextLine(); 
		System.out.println("My Name is " +name);
		
		// instrust user of what program expects
		System.out.println("How old are you?");
		
		// capture number from a user
		int age = scan.nextInt();
		
		System.out.println("Your name is " +name + " your age is " +age);
		
	}

}
