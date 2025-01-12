import java.util.*;
   public class SumOfNumbers{
      public static void main(String[]args){
	    Scanner input = new Scanner(System.in);
		
		// take the inputs for natural number
		System.out.println("Enter number ");
		int number = input.nextInt();
		
		//check if number is natural 
		
		    if(number <= 0){   // then number is not positive
		    
			  System.out.println("The number " + number + " is not a natural number" );
		
		     
		    }else{
				// calculate sum of n naturals numbers 
		        int sumOfNumber = number * (number + 1)/2;
				System.out.println("The sum of " + number + " natural numbers is " + sumOfNumber);
			 } 
	  }
   }