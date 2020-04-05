package com.syntax.class11;

public class TwoDExample {

	public static void main(String[] args) {

		
		String [] [] groceries = 	{ 
									{"cucumber", "potato", "carrot"},
									{"Orange", "Apple", "bannan", "Kiwi"},
									{"milk", "chess", "yogurt"}	
									};
	
				System.out.println(groceries[1][2]); 
				System.out.println(groceries.length); // 3 rows of arrays in groceries 
				
				// print all values 2 for loops 
				//outer = rows, inner = columns 
				// groceries.length will tell us total # of arrays within grocery 
				
				for(int r =0; r<groceries.length; r++)
				{
					for(int c =0; c < groceries[r].length; c++) //calls on the length of each row 
					{
						System.out.print(groceries[r][c] + " "); 
					}
					System.out.println(); // next row 
				}
				
				System.out.println(" ----get eleeemtns using advanced for loop -------");
				
				for(String [] array:groceries) // loop thru all arrays
				{
					for(String items:array) //loop thru each element in array 
					{
						System.out.print(items + " ");
					}
				  System.out.println();
				}
				
	}

}
