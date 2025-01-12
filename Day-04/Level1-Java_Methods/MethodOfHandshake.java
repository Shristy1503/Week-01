import java.util.Scanner;
    public class MethodOfHandshake{
	  public static void main(String[]args){
	      Scanner input = new Scanner(System.in); 
		  System.out.println("Enter number: ");
		  int number = input.nextInt();
		  
		  //object creation of the method
		  MethodOfHandshake object = new MethodOfHandshake();
		   int handshakeNumber = object.handshakeCalculator(number);
		   
		   System.out.println("The number of handshake is " + handshakeNumber);
		  
	  }
	  
	   // creating a function to calculate handshake
	   public int handshakeCalculator(int number){
	   
	   // returns the handshake number 
	    return (number * (number - 1))/2;
	  }
	
	}