import java.util.*;
 public class ConvertDistanceKilometerToMiles{
   public static void main(String[]args){
    Scanner input = new Scanner(System.in);
	System.out.println("Enter the distance in kilometers: ");
	 double distanceKilometer = input.nextDouble();
	 
	 //conversion tp miles
	 double distanceMiles = distanceKilometer/1.6;
	 System.out.println("The total miles is " + distanceMiles + " miles for the given " + distanceKilometer + "km");
   }
 }