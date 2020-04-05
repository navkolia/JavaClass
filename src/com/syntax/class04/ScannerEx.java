package com.syntax.class04;


import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		/*
		 scanner class --> takes input from user,
		 we will provide input value from console. 
		 that value will be taken and used in program 
		 capture text --> input from console 
		 capture numbers  -->  input form console 
		 
		 */
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("please enter any text");
		String text = scan.nextLine(); 
		System.out.println(text);
		
		System.out.println("please enter any number");
		int number= scan.nextInt(); 
		System.out.println(number);
		
		
		System.out.println("End of the Program");

	}

}




	
