package com.syntax.class10;

public class Task {
	

	public static void main(String[] args) {
	
	// create array of animals, 6 elements, use 2 loops to print all elements 
	
	String[] animals = {"lion", "tiger", "monkey", "cat", "dog", "bird"}; 

		for(int i =0; i< animals.length; i++)
		{ System.out.print(animals[i] + " "); }
		
		
		
		System.out.println();
		System.out.println("---------------------------");

		
		
		for(String animal:animals)
		{ System.out.print(animal + " "); }
		
		
		System.out.println();
		System.out.println("----------Integers-----------------");
		
		
		
		
		
		//create array of integers and calculate sum of all integers 
		
		int[] numbers = {1, 2, 3, 4, 5};
		int sum =0; 
		
		for(int number:numbers)
		{  sum += number;  }
		
		System.out.println("Sum of numbers in array is " + sum); 
		
		
		
		
		System.out.println("---------------------------");
		
		
		
		int sum1 =0; 
		
		for(int i =0; i< numbers.length; i++)
		{ sum1 += numbers[i]; }
		
		System.out.println("Sum of numbers in array is " + sum); 
		
		
		
		System.out.println("-----------COuntries----------------");
		
		
		
		
		// Array of countries, retrieve all values from array and print capital for each country 
		
		String[] countries = {"america", "canada", "japan", "england", "mexico"}; 
		
		for(String country:countries)
		{ 
			if(country.equals("america"))
			{ System.out.println("Captial of " + country + " is Washington D.C "); }
			
			else if (country.equals("canada"))
			{ System.out.println("Captial of " + country + " is Toronto "); }
			
			else if (country.equals("japan"))
			{ System.out.println("Captial of " + country + " is Tokyo "); }
			
			else if (country.equals("england"))
			{ System.out.println("Captial of " + country + " is London "); }
			
			else if (country.equals("mexico"))
			{ System.out.println("Captial of " + country + " is Mexico City "); }	
		}
		
		
			System.out.println("-----------Switch----------------");
			
			
			for(int i =0; i< countries.length; i++)
			{
				switch(countries[i])
				{
				case "america":
					System.out.println("Captial is Washington D.C ");
					break;
				case "canada":
					System.out.println("Captial is toronto ");
					break; 
				case "japan":
					System.out.println("Captial  is tokyo ");
					break; 
				case "england":
					System.out.println("Captial  is london ");
					break; 
				case "mexico":
					System.out.println("Captial  is mexico city ");
					break; 
				}
				
			}
		
}
}