 import java.util.Scanner;
    public class SimpleInterestCalculator{
	  public static void main(String[]args){
	      Scanner input = new Scanner(System.in); 
		  System.out.println("Enter principal amount: ");
		  double principal = input.nextDouble();
		  System.out.println("Enter rate of intrest: ");
		  double rate = input.nextDouble();
		  System.out.println("Enter time: ");
		  int time = input.nextInt();
		  
		  simpleInterest(principal, rate, time);
	  }
	  
	  public static void simpleInterest(double principal, double rate, int time){
	   double SI = (principal * rate * time) / 100;
	   System.out.println("The Simple Interest is " + SI + " for principal " + principal + ", rate of interest " + rate + " and time " + time);
	  }
	}