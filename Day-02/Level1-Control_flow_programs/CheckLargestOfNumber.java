 import java.util.Scanner;
   public class CheckLargestOfNumber{
      public static void main(String[]args){
	    Scanner input = new Scanner(System.in);
		
		// take three inputs from the users
		System.out.println("Enter number 1 ");
		int number1 = input.nextInt();
		System.out.println("Enter number 2 ");
		int number2 = input.nextInt();
		System.out.println("Enter number 3 ");
		int number3 = input.nextInt();
		
		// Create variables to store results
		// setting value as false until proven true
		boolean firstLarge = false;
		boolean secondLarge = false;
		boolean thirdLarge = false;
		
		// check which one is the largest number
		if (number1 >= number2 && number1 >= number3) {
            firstLarge = true;
        } else if (number2 >= number1 && number2 >= number3) {
            secondLarge = true;
        } else if (number3 >= number1 && number3 >= number2) {
            thirdLarge = true;
        }
		
		System.out.println("Is the first number the largest? " +firstLarge);
        System.out.println("Is the second number the largest? " + secondLarge);
        System.out.println("Is the third number the largest? " + thirdLarge);
		     
	  
	  }
   }