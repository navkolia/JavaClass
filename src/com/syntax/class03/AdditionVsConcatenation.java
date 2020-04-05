package com.syntax.class03;

public class AdditionVsConcatenation {

	public static void main(String[] args) {
		
		
		int a = 10; 
		int b = 20; 
		
		String x = "Hello"; 
		String y = "Bye"; 
		
		// type syso then ctrl + space --> autocomplete println 
		
		System.out.println(a+b+x+y); //30HelloBye
		System.out.println(a+x+b+y); //10Hello20Bye
		System.out.println(x+y+a+b); //HelloBye1020 
		
		//hello + bye = HelloBye then HelloBye + 10 
		// first attach string +string which = String 
		// then adding the String to # = String 
		
		System.out.println(x+y+(a+b)); //HelloBye30 
		System.out.println(a+""+b+x+y); //1020HelloBye
		
		
	}

}
