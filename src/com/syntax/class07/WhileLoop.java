package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {

		int time = 10; 
		
		while(time<=15) // run till this is not true 
		{
			System.out.println("Good");
			time++; 
			// continually add 1 to time	
		}
		
		System.out.println("-----------");
		
		//print num 1-5
		int num = 1; 
		
		while(num<=5)
		{
			System.out.print(num);
		num++;
		}
		
System.out.println("-----------");
		
		//print num 1-5
		int num1 = 5; 
		
		while(num1>0)
		{
			System.out.print(num1);
		num1--;
		}
	}

}
