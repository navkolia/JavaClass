package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

	Scanner tall = new Scanner(System.in);
	System.out.println("Enter Height in Inches?");
	int height = tall.nextInt(); 
	
	if(height<60)
	{ System.out.println("Short");}
	
	else if (height >= 60 && height<72) 
	{ System.out.println("Medium"); }
	
	else if (height >= 72) 
	{ System.out.println("Tall");}

}
}
