import java.util.*;
    public class IntOperation{
	  public static void main(String[]args){
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter a: ");
	   int a = input.nextInt();
	   System.out.println("Enter b: ");
	   int b = input.nextInt();
	   System.out.println("Enter c: ");
	   int c = input.nextInt();
	   
	   //operation 1 
	      int operation1 = a + b * c;
	   //operation 2
	      int operation2 =  a * b + c;
	   //operation 3
	      int operation3 =  c + a / b;
	   //operation 4
	      int operation4 =  a % b + c;
		  
		 System.out.println("The results of IntOperation are " + operation1 + ", " + operation2 + ", " + operation3 + " and " + operation4); 
	  }
	}