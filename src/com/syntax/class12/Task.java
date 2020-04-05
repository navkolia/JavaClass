package com.syntax.class12;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
// string that print in reverse order 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Write a String");
		String input = scan.nextLine(); 
		
		for(int i =(input.length() -1); i>=0; i--)
		{
			char x = input.charAt(i);
			System.out.print(x);
		}
		System.out.println();
		System.out.println("--------------------------------------");
		
		
// Create string, if not empty ->  has odd # and 3+ character --> print middle character 
		
		Scanner free = new Scanner(System.in);
		System.out.println("Write a String");
		String input2 = free.nextLine(); 
		int z = input2.length();
			
		if(input2.isEmpty())
		{ System.out.println("String is Empty");}
		
		else if((z) %2 != 0 && z >3)
		{  
			int y = (z -1) / 2;
					System.out.println(input2.charAt(y));
		}
		
		else
		{ System.out.println("Does not meet standards of being odd and 3+ characters"); }	
	
		System.out.println();
		System.out.println("--------------------------------------");
	
	// Ask for mom name and dad name
		// ask if having boy or girl 
		// boy --> half of dad name + half of mom name 
		// girl --> half of mom name + half of dad name 
		
		Scanner gender = new Scanner(System.in);
		
		System.out.println("Fathers Name");
		String father = gender.nextLine(); 
		int x = father.length() /2; 
		
		System.out.println("Mothers Name");
		String mother = gender.nextLine(); 
		int y = mother.length()/2; 
		
		System.out.println("Baby Gender?");
		String baby = gender.nextLine(); 
		
		String name = null; 
		
		if(baby.equalsIgnoreCase("boy"))
		{
			name = father.substring(0, x) + mother.substring(y); 
			System.out.println(name);
		}
		
		else if(baby.equalsIgnoreCase("girl"))
		{
			name = mother.substring(0, y) + father.substring(x); 
			System.out.println(name);
		}
	}
}
