import java.util.*;
    public class PrintOddEvenNumber{
	  public static void main(String[]args){
	    Scanner input = new Scanner(System.in);
		 System.out.println("Enter a number ");
		 int number = input.nextInt();
		 
		 // loop for iterating till number
		 for(int i=1; i<=number; i++){
		 // for checking even number inside the loop
		    if(i % 2 == 0){
		       System.out.println(i + " is even number");
		    }
			
	    // if condition false then number is odd
			else{
			   System.out.println(i + " is odd number");
		    }
		 }
	  }
	}