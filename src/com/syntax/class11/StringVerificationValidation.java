package com.syntax.class11;

public class StringVerificationValidation {

	public static void main(String[] args) {
	
		
		String message = "Welcome Admin"; 
		
		//verify string contains a string has a string value is case sensitive, returns T/F 
		
		System.out.println(message.contains("Admin"));
		System.out.println(message.contains("admin"));
		
		//verify string starts with a certain string - return t/f 
		//verify string ends with a certain string
		
		System.out.println(message.startsWith("Welcome"));
		System.out.println(message.endsWith("Admin")); 
		
		
		
		

		
		
		
		
		
		
}

}
