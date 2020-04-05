package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {
		
		int day =5; 
		String dayName; 
		
		if(day ==1) 
		{ dayName = "Monday"; }
		
		else if (day ==2)
		{ dayName = "Tuesday";}
		
		else if (day ==3)
		{ dayName = "Wednesday";}
		
		else if (day ==4)
		{ dayName = "Thursday";}
		
		else if (day ==5)
		{ dayName = "Friday";}
		
		else if (day ==6)
		{ dayName = "Saturday";}
		
		else if (day ==7)
		{ dayName = "Sunday";}
		
		else
		{ dayName = "Invalid";}
		
		
		System.out.println("today is " + dayName); 
		System.out.println("------------Switch--------");
		
		
		
		String today; 
		
		switch(day)
		{
		case 1: 
			today = "monday";
			break;
		case 2: 
			today = "tuesday";
			break;
		case 3: 
			today = "wednesday";
			break;
		case 4: 
			today = "thursday";
			break;
		case 5: 
			today = "friday";
			break;
		case 6: 
			today = "saturday";
			break;
		case 7: 
			today = "sunday";
			break;
		default: 
			today = "invalid";
			break; 
		}
		System.out.println("Today is " + today); 
		
		}

	}

