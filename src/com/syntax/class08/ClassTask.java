package com.syntax.class08;

public class ClassTask {

	public static void main(String[] args) {
		// Calculate sum of odd and even num from 1-99
		// for loop know the starting and ending points 
		
		int even =0;
		int odd =0;
		
		for( int i =1; i <=99; i++)
		{
			if(i%2 ==0) 
			{ even+=i; }
			
			else
			{ odd+=i;}
		}
		System.out.println("Even Sum " + even);
		System.out.println("Odd Sum " + odd);

	}

}
