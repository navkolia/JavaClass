package com.syntax.class13;

public class InterviewQuetio01 {

	public static void main(String[] args) {

/*
 * wirte prgram to swap 2 # without a temp variable 
 * swap 2 strins without a temp variable
 */

		int a = 10; 
		int b = 20; 
		
		a = a + b; 
		b = a - b; 
		a = a - b; 
		
		System.out.println("the value of a = " + a); 
		System.out.println("The value of b = " + b); 
		
		String str1 = "Day"; 
		String str2 = "Night"; 
		
		str1 = str1 + str2; 
		str2 = str1.substring(0, str1.length() - str2.length()); 
		str1 = str1.substring(3); 
		
		System.out.println("the value of str1 = " + str1);
		System.out.println("the value of str2 = " + str2);
		
		
		String str3 = "hello";
		String str4 = "bye";
		
		String shorterstr3 = str3 + str4; 
		
		str4 = shorterstr3.replace(str4,""); 
		str3 = shorterstr3.replace(str4, ""); 
		
		System.out.println("the value of str3 = " + str3);
		System.out.println("the value of str4 = " + str4);

	}

}
