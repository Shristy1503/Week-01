import java.util.*;
   public class AgeCheckForVote{
      public static void main(String[]args){
	    Scanner input = new Scanner(System.in);
		
		// take the inputs for natural number
		System.out.println("Enter age ");
		int age = input.nextInt();
        
		//check if age appropriate for voting
         if(age >= 18){
		  System.out.println("The person's age is " + age + " and can vote");
		  }	else {
		  System.out.println("The person's age is " + age + " and can not vote");
		  }
	  }
   }