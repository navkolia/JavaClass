package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {

	System.out.println("----------------BREAK-----------");	
		
	for(int i =1; i<=10; i++) 
		{
			if(i==4) 
				{
					System.out.println("I am Stopping Looop");
					break;
				}
			System.out.println("I am inside loop");
			System.out.println(i);
		}
	System.out.println("I am outside of hte loop");
	System.out.println("----------------CONTINUE-----------");
	
	for(int x =1; x<=10; x++) 
	{
		if(x==4) 
			{
				System.out.println("Loop should stop Skip the 4 iteration");
				continue;
				
			}
		System.out.println("I am inside loop");
		System.out.println(x);
	}
	System.out.println("I am outside of hte loop");
	System.out.println("----------------EXAMPLE-----------");	
	// print # 1-20, skip 5,6,7 
	
	for(int z = 1; z <=20; z++)
	{
		if( z==5 || z==6 || z==7) // z >=5 && z<=7
		{
			continue;
		}
		System.out.print(z + " ");
	}
	}

}
