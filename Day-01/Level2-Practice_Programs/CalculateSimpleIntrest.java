import java.util.*;
    public class CalculateSimpleIntrest{
	  public static void main(String[]args){
	   Scanner input = new Scanner(System.in); 
	   System.out.println("Enter principal: ");
	   double principal = input.nextDouble();
	   System.out.println("Enter rate: ");
	   double rate = input.nextDouble();
	   System.out.println("Enter time: ");
	   int time = input.nextInt();
	   
	   // calculate the simple intrest 
	   
	   double simpleIntrest = (principal*rate*time)/100;
	   System.out.println(" The Simple Interest is " + simpleIntrest + " for principal " + principal + ", rate of intrest " + rate + "and time " + time); 
	 }
	}