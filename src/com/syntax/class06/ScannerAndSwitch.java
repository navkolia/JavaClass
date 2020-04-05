package com.syntax.class06;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {
		/* ask for gender m or f 
		 * provide description based on gender 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		char gender; 
		String genderType; 
		
		System.out.println("please enter gender: M or F"); 
		gender = scan.next().charAt(0); 
		
		switch(gender) 
		{
		case 'M': 
			genderType = "Male";
			break;
		
		case 'F': 
			genderType = "Female"; 
			break; 
			
		default: 
			genderType = "unknon";
		}
		
		System.out.println("Your Gender is " + genderType);

	}

}
 