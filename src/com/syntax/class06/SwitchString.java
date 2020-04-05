package com.syntax.class06;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {

		 
		String favoriteFood; 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Country"); 
		String country = scan.nextLine(); 
		
		switch(country.toLowerCase())
		{
		case "morocco": 
			favoriteFood = "couscous";
			break;
		case "belarus":
			favoriteFood = "Potato";
			break;
		case "tajikistan":
			favoriteFood = "osh";
			break;
		case "turkey":
			favoriteFood = "baklava"; 
			break; 
		default: 
			favoriteFood = "N/A"; 
			
		}
		System.out.println("I am from " + country + " My favorite food is " + favoriteFood); 
		
		
	}

}
