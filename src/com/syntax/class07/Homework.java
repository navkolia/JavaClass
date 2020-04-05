package com.syntax.class07;

public class Homework {

	public static void main(String[] args) {

// type # 1-100 w/space
		int x =1; 
		while(x >= 1 && x <= 100)
		{
			System.out.print(x+" ");
			x++; 
		}
		
System.out.println(" "); 
System.out.println("------------------------------");
		
		for(int f = 1; f<=100; f++)
		{
			System.out.print(f+" ");
		}
		
System.out.println(" "); 
System.out.println("------------------------------");
		

// # 100-1 
		int y=100; 
		while(y <= 100 && y >= 1)
		{
			System.out.print(y+" ");
			y--; 
		}
System.out.println(" "); 
System.out.println("------------------------------");

// even # 20-50
		
		int z = 20; 
		while(z>=1 && z<=20)
		{
			System.out.print(z+" "); 
			z-=2; 
		}
System.out.println(" "); 
System.out.println("------------------------------");

//Odd # 20-50
		int i = 20; 
		while(i >=20 && i<=50)
		{
			if(i%2 != 0)
			{
			System.out.print(i+" "); 
			}
			i++;
		}	
System.out.println(" "); 
System.out.println("------------------------------");		

		for(int r = 20; r <=50; r++)
		{
			if(r%2!=0)
			{ System.out.print(r + " "); }
		}
		
System.out.println(" "); 
System.out.println("------------------------------");		

		for(int p = 21; p <=50; p+=2)
		{ System.out.print(p + " "); }
				
	}
}
