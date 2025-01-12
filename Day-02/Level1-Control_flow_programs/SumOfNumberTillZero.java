import java.util.Scanner;
    public class SumOfNumberTillZero{
	  public static void main(String[]args){
	  
	    // initialize variable of double
		double total = 0.0;
		while(true){
		// taking user inout till input value is 0
		
	       Scanner input = new Scanner(System.in);
		   System.out.println("Enter a number ");
		   double number = input.nextDouble();
		    
			if(number == 0){
			  break; 
			}
			total += number;
		}
		  System.out.println("Sum of number is " + total);
		  
	  }
	}
		