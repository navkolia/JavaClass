package com.syntax.class04;

import java.util.Scanner;

/* ask for loan amount
 * if  amount < 200000 --> loan approved
 * else --> loan rejected 
 * 
 */

public class ScannerTask1 {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Please enter Loan Amount");
       
		double amount= scan.nextInt(); 
		System.out.println(amount);
		
		if( amount <200000)
		{ System.out.println("Loan Approved"); }
		
		else 
		{  System.out.println("Loan Rejected");  }
		
		
		
	}

}
