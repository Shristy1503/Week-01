import java.util.*;
  public class CheckDivisibility{
	public static void main (String[]args){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter the number: ");
	  int number = input.nextInt();
	
	  // check the divisibility by 5
	  boolean divisible = (number % 5 == 0);
	  System.out.println("Is the number " + number + " divisible by 5 ?: " + divisible);
    }
  }