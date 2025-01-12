import java.util.*;
    public class DoubleOpt{
	  public static void main(String[]args){
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter a: ");
	   double a = input.nextDouble();
	   System.out.println("Enter b: ");
	   double b = input.nextDouble();
	   System.out.println("Enter c: ");
	   double c = input.nextDouble();
	   
	   //operation 1 
	      double operation1 =  a + b * c;
	   //operation 2
	      double operation2 =  a * b + c;
	   //operation 3
	      double operation3 =  c + a / b;
	   //operation 4
	      double operation4 =  a % b + c;
		  
		 System.out.println("The results of IntOperation are " + operation1 + ", " + operation2 + ", " + operation3 + " and " + operation4); 
	  }
	}