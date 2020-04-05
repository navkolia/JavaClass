package com.syntax.class10;

public class Largest {

	public static void main(String[] args) {
		// find largest element in array 
		// assume first element is largest, and compare to each element 
		
		int[] numbers = {200, 30, -1, 900, 50, 878};
		int largest = numbers[0]; 
		
	for(int i = 1; i < numbers.length; i++)
		{
				if(numbers[i] > largest)
				{  largest = numbers[i]; }
		}
	
		System.out.println("Largest num is " + largest);
	}
}


