import java.util.*;
    public class TempuratureConversionToCelsius{
	  public static void main(String[]args){
	   Scanner input = new Scanner(System.in); 
	   System.out.println("Enter Tempurature: ");
	   float farenheit = input.nextFloat();
	    // for conversion in celsius
		
		float celsiusResult = (float)((farenheit - 32)* 5/9);
		
		System.out.println("The " + farenheit + " farenheit is " + celsiusResult + " celsius");
	  }
	}