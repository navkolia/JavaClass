package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		double d = 10;
		System.out.println(d);  
		//10.0, convert integer value 10 to double value 10.0
		
		//int i = 10.99; 
		// compile time error saying: type mismatch, cannot convert double to int  
		
		/*
		  casting = changing value of one type to another type 
		  primitive and non primitive casting 
		  2 types of casting: 
		  
		  1) widening (implicit casting is automatically)
		  Byte -> short -> int -> long -> float -> double
		  store smaller values into bigger ones, store anything in double 
		  compiler will automatically convert smaller value into bigger
		  
		  
		  2)narrowing (explicit casting is manually) 
		  Double -> float -> long -> int -> short -> byte 
		  compiler will not store bigger values into smaller value
		  must be done manually 
		 */
		
		
		//explicit narrowing, done manually 
		int i =(int)10.99;  // take double of 10.99 and store in int i as narrowing explicitly 
		System.out.println(i); //10  
		// loss of .99 
		
		//byte -128 to 127 
		byte b =(byte)1284; //4  convert 1284 into byte, output will be unknown in internal operation 
		System.out.println(b);
		//loss of information
		
		
	}

}
