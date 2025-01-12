import java.util.*;
 public class ConvertDistance{
   public static void main(String[]args){
     Double distanceKilometers = 10.8;
	 Double conversionValue = 1.6;
         // converting distance from kilometers to miles
	 Double distanceMiles = distanceKilometers/conversionValue;
	 System.out.println("The Distance "+ distanceKilometers + "km in miles is "+ distanceMiles);
   }
  }