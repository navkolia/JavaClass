package com.syntax.class04;

public class Task {

	public static void main(String[] args) {
		/* has diploma --> congratulations --> gpa >= 3.5 --> you get scholarship 
		 * 								        else      --> study harder 	
		 * 
		 * 				--> get a diploma 
		 * 
		 */
		
		boolean diploma = true;
		double gpa = 3.2;
		
		if(diploma)
		{ 
			System.out.println("Congratulation");
			
			if(gpa >= 3.5) 
			{  System.out.println("You get Scholarship");  }
			else 
			{  System.out.println("Study Harder");  }
		}
		
		else 
		{ System.out.println("get a diploma");  }
		
	}
}
