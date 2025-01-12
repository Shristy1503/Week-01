import java.util.*;
 public class LengthOfSquare{
   public static void main(String[]args){
    Scanner input = new Scanner(System.in);
	  System.out.println("Enter perimeter: ");
	  double perimeter = input.nextDouble();
	   
	   // calculating length from perimeter 
	   
	   double sideLength = perimeter/4;
	   System.out.println("The length of side is " + sideLength + " whose perimeter is " + perimeter);
   }
 }