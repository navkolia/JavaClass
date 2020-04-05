package com.syntax.class11;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// accept username and password 
		// confirm password 
		// password should be min 8 character
			// less than 8 - "password i too shor"
		//password cannot contain username 
			//"password cannot contain username"
		//password should equal confirmed 
			//passwords do not match 
		//all met 
			//Username and Password has been created 
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please Enter Username");
		String username = input.nextLine(); 
		
		System.out.println("Plase Enter Password");
		String password = input.nextLine(); 
		
		System.out.println("Please Confirm Password");
		String confirm = input.nextLine(); 
		
		if(username.isEmpty() || password.isEmpty())
			{ System.out.println("Username and Password cannot be empty");  }
		
		else if(password.length() <=8)
			{ System.out.println("Password is too short"); }
			
		else if(password.contains(username))
			{ System.out.println("Password cannot contain username"); }
		
		else if(!password.equals(confirm))
			{ System.out.println("Passwords Do Not Match"); }
		
		else
		{  System.out.println("Username and Password Created"); }
		
	}
}
