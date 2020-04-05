package com.syntax.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {
/* we hae 7 days in week 
 * if day is 2,3 --> SDLC Class 
 * if day 6,7 --> java class 
 * if day 1, 5 --> off day 
 * if day 4 --> review class 
 * 
 */
		
		int day = 6; 
		
		if(day ==2 || day == 3)
			{System.out.println("Today is SDLC Class");}
		
		else if (day ==6 || day == 7)
		{System.out.println("Today is Java Class");}
		
		else if (day ==1 || day == 5)
		{System.out.println("Today is NO Class");}
		
		else if (day ==4)
		{System.out.println("Today is Review Class");}
		
		else 
			{System.out.println("Invalid");}
		
		
		System.out.println("-------------------------------");
		
				String day1 = "Saturday";
		
		if(day1.equals("Tuesday") || day1.equals("Wednesday"))
			{System.out.println("Today is SDLC Class");}
		
		else if(day1.equals("Saturday") || day1.equals("Sunday"))		
		{System.out.println("Today is Java Class");}
		
		else if(day1.equals("Monday") || day1.equals("Friday"))		
		{System.out.println("Today is NO Class");}
		
		else if(day1.equals("Thursday"))		
		{System.out.println("Today is Review Class");}
		
		else 
			{System.out.println("Invalid");}
		
		
		
	}

}
