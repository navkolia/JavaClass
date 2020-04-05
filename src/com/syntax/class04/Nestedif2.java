package com.syntax.class04;

public class Nestedif2 {

	public static void main(String[] args) {
		/* Check if patient has any allergies 
		 * if no allergies -> you are healthy 
		 * else check if patient has 
		 * 			orange allergy -> do not eat oranges 
		 * 			apple allergy -> do not eat apples 
		 * 			kiwi allergy -> do not eat kiwi 
		 */

		boolean allergy = true; 
		boolean appleAllergy = true; 
		boolean orangeAllergy = true; 
		boolean kiwiAllergy = false; 
		
		if(allergy) 
			{
				System.out.println("Answer Questions Below");
				
				if(appleAllergy) 
					{  System.out.println("Do not Eat Apples");  }
				
				if(orangeAllergy) 
					{  System.out.println("Do not Eat oranges");  }
				
				if(kiwiAllergy) 
					{  System.out.println("Do not Eat kiwi");  }
			}
		
		else 
			{  System.out.println("You are Healthy");  }
		
	}

}


//if statements can have else within it
//if statements can also be in else block 


