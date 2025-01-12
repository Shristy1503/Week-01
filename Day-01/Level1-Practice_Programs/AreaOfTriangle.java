import java.util.*;
 public class AreaOfTriangle{
   public static void main(String[]args){
    Scanner input = new Scanner(System.in);
	  System.out.println("Enter height: ");
	  double heightInCentimeter = input.nextDouble();
	  System.out.println("Enter base: ");
	  double baseInCentimeter = input.nextDouble();
	  
	  //calculating the area of triangle when base and height taken in centimeter
	  
	  double areaInCentimeters = 0.5*heightInCentimeter*baseInCentimeter;
	  
	  //calculating the area of triangle when base and height taken in Inches 
	    
		double baseInches = baseInCentimeter/2.54;
		double heightInches = heightInCentimeter/2.54;
		double areaInInches = 0.5*baseInches*heightInches;
	  
	  System.out.println("Your area in cm is " + areaInCentimeters + " and inches is " + areaInInches );
   }
 }