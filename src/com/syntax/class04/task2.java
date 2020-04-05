package com.syntax.class04;

public class task2 {

	public static void main(String[] args) {
		/* mortage rate 
		 * mortage price 
		 * 
		 * if rate > 4.5 ---> not buy 
		 * 				---> buy  --> price > 200000 --> take loan 
		 * 						   --> else --> pay cash
		 * 
		 */
		
		double mortageRate = 5.0; 
		double mortagePrice = 299999;
		
		if(mortageRate > 4.5)
		{  System.out.println("Do Not Buy"); }
		
		else 
		{
			System.out.println("Decide to Buy"); 
			
			if(mortagePrice > 200000)
				{  System.out.println("Take Loan");  }
			else 
				{  System.out.println("Pay Cash");  }
			
		}
		
	}

}
