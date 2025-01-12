import java.util.*;
    public class ForLoopCountdown{
	  public static void main(String[]args){
	    Scanner input = new Scanner(System.in);
		 System.out.print("Enter count down number ");
		 int counter = input.nextInt();
		 
		 // the counter value in loop till 1 using for loop
          for(int i = counter;i>=1;i--){
		  // print the calue each time while decrementing
		   System.out.println(i);
		   
		  }		 
	  }
	}