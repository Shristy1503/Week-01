import java.util.*;
    public class TempuratureConversion{
	  public static void main(String[]args){
	   Scanner input = new Scanner(System.in); 
	   System.out.println("Enter Tempurature: ");
	   float celsius = input.nextFloat();
	    // for conversion in farenheit
		
		float farenheitResult = (float)((celsius * 9/5) + 32);
		
		System.out.println("The " + celsius + " celsius is " + farenheitResult + " farenheit");
	  }
	}