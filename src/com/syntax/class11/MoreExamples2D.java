package com.syntax.class11;

public class MoreExamples2D {

	public static void main(String[] args) {
		// create array to store professions 
		
		String[][] professions = { 
				{"QA tester", "developter", "product owner", "scrum master"},
				{"math teacher", "science teacher", "history teacher"},
				{"dentist", "doctor"}
		};
		
		//advanced for loop 
		
		for(String[] field:professions)
		{
			for(String occupation:field)
			{
				System.out.print(occupation + " "); 
			}
			System.out.println();
		}

	}

}
