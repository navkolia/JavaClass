package com.syntax.class13;

public class InterviewQ3 {

	public static void main(String[] args) {
		// print first 10 # of fibonacci serie 
		// fib = add 2 previous # to get the sum 
		// 0 + 1 =1 = 2 = 3 = 5= 8 = 13 = 21 
		// assign 0=a b=1 to get c, reassign b to a and c to b, redo all the way 
		
		
		int a = 0; 
		int b = 1; 
		int c;
		
		for (int i =1; i<=10; i++)
		{
			System.out.print(a + " ");
			c = a + b; 
			a = b; 
			b = c; 
			
			
		}

	}

}
