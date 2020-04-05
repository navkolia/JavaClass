package com.syntax.class13;

public class InterviewQ2 {

	public static void main(String[] args) {
		// check wheter given # is prime or not 
		// prime = positive #, >1, divisible by 1 ad itself only
		// 2,3,5,7,11,13,17
		
		
		int x = 7; 
		
		boolean isPrime = true; 
		
		if( x > 1) 
		{
			for(int i=2; i <x; i++)
			{
				if(x % i ==0)
				{
					isPrime = false; 
					break;
				}
			}
		}
			
			
			else
					{ 
						isPrime = false;
					}
		System.out.println("Given number " + x + " is prime? " + isPrime); 
		}

	}

