package com.syntax.class06;

import java.util.Scanner;

public class SwitchTask2 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		char grade; 
		String result; 
		
		System.out.println("please enter grade"); 
		grade = scan.next().charAt(0); 
		
		switch(grade) 
		{
		case 'A': 
			result = "Excellent";
			break;
		
		case 'B': 
			result = "Good"; 
			break; 
			
		case 'C': 
			result = "Average"; 
			break; 
			
		case 'D': 
			result = "Bad"; 
			break; 
			
		default: 
			result = "N/A";
		}
		
		System.out.println("Your Grade is " + result);

	}

}
 
		
		
		
		
		
		

