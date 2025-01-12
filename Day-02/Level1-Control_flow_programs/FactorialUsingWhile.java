import java.util.*;
    public class FactorialUsingWhile{
	  public static void main(String[]args){
	    Scanner input = new Scanner(System.in);
		 System.out.print("Enter number ");
		 int number = input.nextInt();
		 
		 //initialize a variable for the factorial
		  int factorialOfNumber = 1;
		 // calculate the factorial of the number
          int i = 1;
          while(i <= number){
		     factorialOfNumber *= i;
			i++;
		  }		  
		   System.out.print("Factorial is " + factorialOfNumber);
	  }
	}