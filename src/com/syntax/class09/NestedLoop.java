package com.syntax.class09;

public class NestedLoop {

	public static void main(String[] args) {
		// print 10 to 99 

		for(int i =1; i <= 9; i++)
		{
			for(int y =0; y <=9; y++)
				{System.out.println(i + "" + y);}
		}
		
		System.out.println("------------------------------------");
		
		//prnt military clock --> outer loop is hours, inner loop is minutes 
		
		for(int i = 0; i <=24; i++)
		{
			for(int x = 0; x <=59; x++)
			{
				if(x<10)
				{ System.out.println(i+ ":0" + x); }
				else 
				{ System.out.println(i+ ":" + x); }
			}
		}	
		
		
		System.out.println("------------------------------------");
		

		
		// print odoemter that prints to 9999
		/*
		for(int i = 0; i <=9; i++)
		{
			for(int x = 0; x <=9; x++)
			{
				
				for(int y = 0; y <=9; y++)
				{
					for(int z =0; z<=9; z++)
					{ System.out.println(i + "" + x + "" + y + "" + z); }
				}	
			}
		}
		*/
	}		
}
