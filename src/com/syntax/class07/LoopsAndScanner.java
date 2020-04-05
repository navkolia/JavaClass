package com.syntax.class07;

import java.util.Scanner;

public class LoopsAndScanner {

	public static void main(String[] args) {
//ask user name and print good afternoon and name 
		/*
		String name; 
		int i = 1; 
		Scanner input = new Scanner(System.in);
		
		while(i <=5) 
		{
			System.out.println("What is your name? "); 
			name = input.nextLine(); 
			
			System.out.println("Good Afternoon "+ name); 
			
			i++;
		}	
		*/
	System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	
	// playing lotter, lucky # = 17, keep asking for num from 1-20 untill you guess lucky num 
	
	
	/*
	Scanner num = new Scanner(System.in);
	System.out.println("Guess a Num 1-20 "); 
	int guess = num.nextInt();
	
	while(guess != 17)
	{
		System.out.println("Guess a Num 1-20 "); 
		guess = num.nextInt();
		
	}
		System.out.println("You Guess the lucky number 17");
		*/
		
	Scanner num1 = new Scanner(System.in);
	int guess1;
	
	do {
		System.out.println("Guess a Num 1-20 "); 
		guess1 = num1.nextInt();
	}
	
	while(guess1 != 17); 
	
	System.out.println("You Guess the Lucky Number 17");
			
	}
}


