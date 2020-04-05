package com.syntax.class10;

public class array {

	public static void main(String[] args) {

		int []  grades = new int[4]; 
		grades[0] = 90; 
		grades[1] = 98; 
		grades[2] = 97; 
		grades[3] = 67; 
		
		int average = (grades[0] + grades[1] + grades[2] + grades[3])/4; 
		System.out.println(average); 
		
		// --------------------------------
		System.out.println("-----------array of cities------------");
		
		String[] cities = {"NYC", "DC", "Paris", "NJ", "LA"}; 
		System.out.println("I live In " + cities[1]); 
		
		// # elements in the array 
		
		System.out.println(cities.length); 
		
		// last element in array 
		System.out.println(cities[cities.length -1]);
    System.out.println("----------------");
		
		// acces all elements in array 
		
		for(int i =0; i < cities.length; i++)
		{
			System.out.print(cities[i] + " "); 
		}
		
	}

}
