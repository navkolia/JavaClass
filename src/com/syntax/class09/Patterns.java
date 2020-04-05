package com.syntax.class09;

public class Patterns {

	public static void main(String[] args) {
		//*****
		for(int a =1; a <=5; a++)
		{ System.out.print("*"); }
		System.out.println();
		
		System.out.println("------------------");
		
		for(int a =1; a <=5; a++)
		{ System.out.print("*"); }
		System.out.println();
		
		for(int a =1; a <=5; a++)
		{ System.out.print("*"); }
		System.out.println();
		
		for(int a =1; a <=5; a++)
		{ System.out.print("*"); }
		System.out.println();
		
		for(int a =1; a <=5; a++)
		{ System.out.print("*"); }
		System.out.println();
		
		System.out.println("-------printing patter with nester loop-----------");
		// outer loop is rows, inner loop is colums 
		
		for(int a =1; a <=4; a++) //Rows = 4
		{
			for(int b =1; b <=5; b++)// Columns  = 5
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------");
		
		for(int a =1; a <=10; a++) //Rows = 10
		{
			for(int b =1; b <=10; b++)// Columns  = 10
			{
				System.out.print("*");
			}
			System.out.println();
		}
			
System.out.println("-----------10 rows 5 columns----------------------");
		
		for(int a =1; a <=10; a++) //Rows = 10
		{
			for(int b =1; b <=5; b++)// Columns  = 5
			{
				System.out.print("*");
			}
			System.out.println();
		}
System.out.println("--------5 rows 1-5-------------------------");
		
		for(int a =1; a <=5; a++) //Rows = 10
		{
			for(int b =1; b <=5; b++)// Columns  = 10
			{
				System.out.print(b);
			}
			System.out.println();
		}
		
System.out.println("------------5 rows 1-9---------------------");
		
		for(int a =1; a <=5; a++) //Rows
		{
			for(int b =1; b <=9; b++)// Columns 
			{
				System.out.print(b);
			}
			System.out.println();
		}
		
		System.out.println("------------5 rows---------------------");
		
		for(int a =5; a >0; a--) //Rows
		{
			for(int b =5; b>0; b--)// Columns 
			{
				System.out.print(b);
			}
			System.out.println();
		}
		
System.out.println("------------5 rows---------------------");
		
		for(int a =5; a >0; a--) //Rows
		{
			for(int b =5; b>0; b--)// Columns 
			{
				System.out.print(a);
			}
			System.out.println();
		}
		
		
System.out.println("------------Triangle of stars ---------------------");
		
// Number of colums is dependent on num of rows. 

		for(int a =1; a <=4; a++) //Rows
		{
			for(int b =1; b<=a; b++)// Columns 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("------------Triangle of numbers ---------------------");
		
		// Number of colums is dependent on num of rows. 

				for(int a =1; a <=5; a++) //Rows
				{
					for(int b =1; b<=a; b++)// Columns 
					{
						System.out.print(b);
					}
					System.out.println();
				}
		
	}

}
