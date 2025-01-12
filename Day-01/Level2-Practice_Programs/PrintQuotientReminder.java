 import java.util.*;
    public class PrintQuotientReminder{
	  public static void main(String[]args){
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter number 1: ");
	   int number1 = input.nextInt();
	   System.out.println("Enter number 2: ");
	   int number2 = input.nextInt();
	    // for printing quotient
		int quotient = number1/number2;
		
		//for reminder 
		int reminder = number1%number2;
		System.out.println("The quotient is " + quotient + " and reminder is " + reminder + " of two numbers " + number1 + " and " + number2);
		
	  }
	}