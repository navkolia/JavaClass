package com.syntax.class12;

public class ReplaceSplit {

	public static void main(String[] args) {
		
	// replace one character/string with another character/string 
	// case sensitive, if nothing is found, nothing will happen 
		
		String one = " I am a good Tester ";
		
		String two = one.replace("a",  "c"); 
		System.out.println(two); 
		
		String three = one.replace("good",  "Great");
		System.out.println(three);
		
		System.out.println("-----------------");

	/// replae all characters from a range to something else 
		
		String str = "Phone Number is 123948472163849249"; 
		str = str.replaceAll("[a-z]" , "5");
		System.out.println(str);
		
		str = str.replaceAll("[A-Za-z]" , "5");
		System.out.println(str);
		
		str = str.replaceAll("[^a-z]" , "n");
		System.out.println(str);
		
		System.out.println("-----------------------");
		
	// split - breaks up your string and returns it in array 
		
		String example = "Today is my favorite Java Class";
		
		String[] array = example.split("my");
		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		String[] array1 = example.split("a"); 
		
		for(String word: array1)
		{ System.out.print(word + " "); }
		
		System.out.println();
		
		String[] array2 = example.split(" ");
		 
		for(int i =0; i <array2.length; i++)
		{
			System.out.print(array2[i] + " - ");
		}
		
		
		
	}

}
