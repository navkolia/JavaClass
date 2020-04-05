package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int num = 10; 
		// variable num only holds single value 
		
		// declaring arry and initialize it 
		
		int[] array = new int[4]; 
		array[0] = 10; 
		array[1] =20;
		array[2] = 30; 
		array[3] = 40; 
		
		// access elements from array 
		
		System.out.println(array[1]); 
		
		
		// alternate method to store array
		
		String[] carArray; // just declaring the array that will store strings  
		String carArray1[]; // can also be written like this 
		
		// now initialize 
		carArray = new String[3]; 
		carArray[0] = "BMW";
		carArray[1] = "Honda";
		carArray[2] = "Toyota"; 
		
		System.out.println("I am driving " + carArray[2]); 
		
		
		
		//change values within  array 
		
		carArray[1] = "Volvo"; 
		System.out.println(carArray[1]); 
		

	}

}
