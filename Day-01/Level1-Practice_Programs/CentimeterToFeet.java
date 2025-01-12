import java.util.*;
  public class CentimeterToFeet{
    public static void main(String[]args){
	 Scanner input = new Scanner(System.in);
	  // input for height
	  double heightCentimeter = input.nextDouble();
      
     /* conversion of 1 inch = 2.54cm
	     1 foot = 12 inches and remaining inch after converting */
	 double heightInInches = heightCentimeter/2.54;
	 int heightInFeet = (int)(heightInInches/12);
	 heightInInches = heightInInches%12;
	 
	 System.out.println("your height in cm is " + heightCentimeter + " while in feet is " + heightInFeet + " and in inches is " + heightInInches);
	}
  } 