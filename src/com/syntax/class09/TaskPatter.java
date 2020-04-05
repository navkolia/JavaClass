package com.syntax.class09;

public class TaskPatter {

	public static void main(String[] args) {
		
System.out.println("------------inverted triangle of numbers  ---------------------");
		
		// Number of colums is dependent on num of rows. 

				for(int a =5; a >0; a--) //Rows
				{
					for(int b =a; b>0; b--)// Columns 
					{ System.out.print(a); }
					
					System.out.println();
				}
				
				System.out.println("------------Diamond  ---------------------");
				
				// Number of colums is dependent on num of rows. 

			for(int a =1; a <=5; a++) //Rows
			{
					for(int b =1; b<=a; b++)// Columns 
						{ System.out.print("*"); }
				System.out.println();
			}
						
			for(int a =4; a >0; a--) //Rows
			{ 
					for(int b =a; b>0; b--)// Columns 
						{ System.out.print("*"); }
				System.out.println();
			}
	}
}
