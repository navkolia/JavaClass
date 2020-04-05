package com.syntax.class13;

public class InterviewQ4 {

	public static void main(String[] args) {
		// find out how many alph characters are present in a string? 
		// find # of words in string 

		String str = "High9898eaothoanve(&#(&(#(:"; 
		str = str.replaceAll("[A-Za-z]", "");
		int num = str.length();
		System.out.println("Number of Alpha Character = " + num);
		
		String myString = "Today is Wednesday and it is Java Class"; 
		String[] array = myString.split(" "); 
		int words = array.length; 
		System.out.println("Total words in string:" + myString + " = " + words); 
		
		
	}

}
