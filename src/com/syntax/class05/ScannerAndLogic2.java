package com.syntax.class05;

		/* you are salesman 
		 * ask how much sales 
		 * based on sles calculate commission
		 * sales between 1--100 --> commision is 10
		 * sales between 100-200 --> commsssion is 20% 
		 * sales more than 200--500 --> commis is 30
		 * sales more than 500 --> 50% 
		 * 
		 */
		
		import java.util.Scanner;
		
		public class ScannerAndLogic2 {
			
			public static void main(String[] args) 
		{
			Scanner scan;
			double sales;
			double commission;
			
			scan=new Scanner(System.in);
			System.out.println("Please enter your sales amount");
			sales=scan.nextDouble();
			
			//code below look cleaner
			if(sales>=1 && sales<=100) 
			{
				//give user 10% commission
				commission=sales*0.10;
				}
			
				else if(sales>100 && sales<=200) 
				{
					//give user 20% commission
					commission=sales*0.2;
					}
			
				else if(sales>200 && sales<=500) 
				{
					//give user 30% commission
					commission=sales*0.3;
					}
			
				else {commission=sales*0.5;}
			
			System.out.println("Based on your sales you commission is ="+commission);
			if (commission>100) 
			{System.out.println("You are an awesome seller");}
			}
	}
