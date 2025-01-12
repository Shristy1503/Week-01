  import java.util.*;
    public class WhileLoopCountdown{
	  public static void main(String[]args){
	    Scanner input = new Scanner(System.in);
		 System.out.println("Enter count down number ");
		 int counter = input.nextInt();
		 
		 // the counter value in loop till 1
          while(counter >= 1){
		   System.out.println(counter);
		   counter--;
		  }		 
	  }
	}