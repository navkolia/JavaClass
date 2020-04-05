package com.syntax.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// write program that reads a range of integers(start and end point) given by user, print sum of even numbers 
		
		int even = 0;
		int odd = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("what is the starting num");
		int start = scan.nextInt(); 
		
		System.out.println("what is the ending num");
		int end = scan.nextInt();
		 
		for(int i = start; i<=end; i++)
		{
			if(i%2 ==0)
			{ even += i; }
			else 
			{ odd +=i; }
		}
		System.out.println("Range is " + start + " to " + end); 
		System.out.println("Sum of even numbers is " + even); 
		System.out.println("Sum of even numbers is " + odd); 
	}
}
