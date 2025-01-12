import java.util.*;
 public class MaximumNumberOfHandshake{
   public static void main(String[]args){
    Scanner input = new Scanner(System.in);
	  System.out.println("Enter number of students: ");
	   int numberOfstudents = input.nextInt();
	  
	  // calculating maximum number of handshakes possible
	  int handshakes = (numberOfstudents*(numberOfstudents - 1))/2;
	  System.out.println("The maximum number of handshakes possible is  " + handshakes);
   }
 }