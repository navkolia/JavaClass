package com.syntax.class09;

public class MoreArray {

	public static void main(String[] args) {


		String[] students = new String[3]; // array made of string datatype, holds 3 eleemnts
		
		students[0] = "joe";   // assigning each index an element of datattype string 
		 
		students[2] = "steve";
		
		// can store extra elements with complier, but when you run, will get error 
		
		//students[3] = "jack"; 
		
		//System.out.println(students[3]);  // get runtime error, cannot expand array size in runtime 
		
		System.out.println(students[1]);  

		for(int i =0; i<students.length; i++)
		{
			System.out.println(students[i]);
		}
		
	}

}
