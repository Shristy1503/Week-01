import java.util.*;
   public class NumberCheck{
      public static void main(String[]args){
	    Scanner input = new Scanner(System.in);
		
		// take the inputs for number
		System.out.println("Enter number ");
		int number = input.nextInt(); 
		
		//checking if number is positive
		 if(number > 0){
		
		// the number is positive
		   System.out.println("The number " + number + " is positive");
		  } else if(number == 0){
		  
		// the number is zero
		   System.out.println("The number is " + number);
		  } else 
		// the number is negative
		   System.out.println("The number " + number + " is negative");
	  }
   }