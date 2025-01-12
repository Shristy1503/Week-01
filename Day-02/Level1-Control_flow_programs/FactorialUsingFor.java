import java.util.*;
    public class FactorialUsingFor{
	  public static void main(String[]args){
	    Scanner input = new Scanner(System.in);
		 System.out.print("Enter number ");
		 int number = input.nextInt();
		 
		 //initialize a variable for the factorial
		  int factorialOfNumber = 1;
		 // calculate the factorial of the number using for loop
          for(int i = 1; i<= number; i++){
		  // factorial is updated each time and stored
		     factorialOfNumber *= i;  
		  }		  
		   System.out.print("Factorial is " + factorialOfNumber);
	  }
	}