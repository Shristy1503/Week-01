import java.util.*;
    public class SwapTwoNumbers{
	  public static void main(String[]args){
	   Scanner input = new Scanner(System.in); 
	   System.out.println("Enter number 1: ");
	   int number1 = input.nextInt();
	   System.out.println("Enter number 2: ");
	   int number2 = input.nextInt();
	   
	   //swap number using temporary variable
	   
	   int tempporaryVariable = number1;
	   number1 = number2;
	   number2 = tempporaryVariable;
	   System.out.println("The swapped numbers are " + number1 + " and " + number2);
	   
	 }
	}