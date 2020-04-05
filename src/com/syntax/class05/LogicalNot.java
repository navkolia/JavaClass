package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
		boolean a = true; 
		boolean b = false; 
		
		boolean c =!a;
		boolean d = !b; 

		System.out.println(a);
		System.out.println(b);
		
		System.out.println(c);
		System.out.println(d);
		
		boolean isCold = false; 
		
		if(!isCold)
		{
			System.out.println("Hello");
		}
		
		else 
		{
			System.out.println("bye"); 
		}
		
		String day1 = "Monday"; 
		
		if(!(day1.equals("Monday") || day1.equals("Friday")))
		{
			System.out.println("I'll be at Syntax");
		}
		else 
		{ System.out.println("Ill be at home"); }
		
	}

}
