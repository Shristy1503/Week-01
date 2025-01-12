import java.util.*;
  public class CheckFirstSmallestNumbers{
	 public static void main (String[]args){
	 
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter the number 1: ");
	    int number1 = input.nextInt();
		System.out.println("Enter the number 2: ");
	    int number2 = input.nextInt();
		System.out.println("Enter the number 3: ");
	    int number3 = input.nextInt();
		
		//Use conditional statements and check if smallest
		
		if(number1 < number2 && number1 < number3){
		  System.out.println("Is the first number the smallest? Yes");
		}
		else 
		System.out.println("Is the first number the smallest? No ");
	}
  }