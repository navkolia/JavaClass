package com.syntax.class07;

public class Task3 {

	public static void main(String[] args) {
// 2 variables, day < 6, need day off, reach 6, no need for day off
		
		boolean workDay = true; 
		int day = 1;
		
		while(workDay)
		{
			if(day <6)
		{System.out.println("I need day off"); }
		
		else 
		{
			System.out.println("No need for Day off"); 
			workDay = false; 
		}
		day ++; 
		
	}
	}

}
