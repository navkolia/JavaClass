package com.syntax.class04;

public class NestedElseifs {

	public static void main(String[] args) {
		/*
		 if student completed quiz --> ask for score --> score > 90 --> great job 
		 												 score > 80 --> well done 
		 												 score > 70 --> you could do better 
		 												
		 												other score --> you fail 
		 												 
		 Student did not complete quiz --> not good --> please do homework ontime
		 
		 */
		
		boolean quizCompleted = true; 
		int score = 46; 
		
		if(quizCompleted) 
		{
			System.out.println("Let's check your score");
			
			if(score>90)
			{  System.out.println("Great Job, You study a lot");  }
				
				else if(score > 80) 
					{  System.out.println("well done");  }
				else if(score > 70) 
					{  System.out.println("Could have done better");  }
			
			else 
			{	System.out.println("You fail");  }
		}
		
		else 
		{  System.out.println("Please do HW online");  }
		
	}
}
