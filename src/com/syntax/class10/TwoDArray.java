package com.syntax.class10;

public class TwoDArray {

	public static void main(String[] args) {
		
		
		//creating new array with 3 rows and 4 columns 
		int[][] numbers = new int[3][4]; 
		
		//1st row 
		numbers[0][0] = 10; 
		numbers[0][1] = 20; 
		numbers[0][2] = 30; 
		numbers[0][3] = 40; 
		//2nd row 
		numbers[1][0] = 5; 
		numbers[1][1] = 10; 
		numbers[1][2] = 15; 
		numbers[1][3] = 20; 
		//3rd row 
		numbers[2][0] = 1; 
		numbers[2][1] = 2; 
		numbers[2][2] = 3; 
		numbers[2][3] = 4; 
		
		//print value 15 
		System.out.println(numbers[1][2]); 
		
		
		// creating array 
		int[][] nums = { {10,20,30,40}, 
						 {5,10,15,20}, 
						 {1,2,3,4}       }; 
		
		
		
		System.out.println(nums[2][3]); 
		
		String[][] months = { {"June", "July", "Aguust"}, 
							  {"September", "October", "November"}, 
							  {"December", "January", "Febuary"}, 
							  {"March", "April", "May"}  };
		
		System.out.println(months[0][2]);
		System.out.println(months[1][2]);
		System.out.println(months[2][2]);
		System.out.println(months[3][2]);

	System.out.println(months.length);// how many rows 
	int firstArray = months[0].length; // how many elements in 1st row 
	System.out.println(firstArray); 
		
		System.out.println("---------------------------");
		
		//printing the full array 
		
		for(int row =0; row<months.length; row++) // iterates over rows 
		{
			for(int col = 0; col < months[row].length; col++) // iterates over columns 
			{
				System.out.print(months[row][col] + " ");
			}
			System.out.println(); 
		}
	}

}
