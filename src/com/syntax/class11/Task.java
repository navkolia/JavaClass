package com.syntax.class11;

public class Task {

	public static void main(String[] args) {
		// array of cars, get the array 
		
		String[][] country = { 	{"ford", "dodge", "chevy"}, 
								{"volvo", "bmw", "jaguar"},
								{"toyota", "honda", "hyundai"}
							};
		
		int sum =0; 
		
		for(int row =0; row< country.length; row++)
		{
			for(int col =0; col<country[row].length; col++)
			{
				System.out.print(country[row][col] + " ");
				sum+=col; 
			}
			System.out.println();
		}
		System.out.println(sum);
		
		
		System.out.println("-----------------"); 
		
		
		int sum1 =0; 
		for(String[] company:country)
		{
			for(String car:company)
			{
				System.out.print(car + " ");
				sum1 ++; 
			}
			System.out.println(); 
		}
		System.out.println(sum1); 
	}

}
