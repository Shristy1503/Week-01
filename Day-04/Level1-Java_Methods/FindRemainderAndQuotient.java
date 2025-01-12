import java.util.Scanner;
   public class FindRemainderAndQuotient{
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt(); 
		System.out.print("Enter divisor ");
        int divisor = input.nextInt(); 
		
		// method call 
		int[] result = findRemainderAndQuotient(number, divisor);
		// display the quotient and reminder
		System.out.println("The quotient is: " + result[0]);
        System.out.println("The reminder is: " + result[1]);

	 }
	 
	  public static int[] findRemainderAndQuotient(int number, int divisor){
	      // for printing quotient
		  int quotient = number / divisor;
		  // for printing reminder
		  int reminder = number % divisor;
		  
		  return new int[]{quotient, reminder};
	  
	  }
   }	 