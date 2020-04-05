package com.syntax.class10;

public class AdvancedForLoop {

	public static void main(String[] args) {
		
		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F'};
		
		// get all elements using normal for loop 
		for(int i =0; i<grades.length; i++)
		{  System.out.print(grades[i] + " ");   }
		
		System.out.println();
		System.out.println("--------advanced for loop------------------");
			
			// for advanced  grade is any variable that represents each element in array grades 
			for(char grade : grades) 
			{  System.out.print(grade + " ");  }
			
			System.out.println();
			System.out.println("--------advanced for loop------------------");
			
			// using advanced for with if loop, if grade = "A" --> "A" is a good grade 
			for(char grade : grades) 
			{  
				if(grade =='A')
					{ System.out.println(grade + " is a good grade"); }
				else 
					{ System.out.print(grade + " ");  }
			}	
		}
	}


