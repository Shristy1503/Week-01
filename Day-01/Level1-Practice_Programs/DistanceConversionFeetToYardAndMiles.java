import java.util.*;
 public class DistanceConversionFeetToYardAndMiles{
   public static void main(String[]args){
    Scanner input = new Scanner(System.in);
	  System.out.println("Enter distance in feet: ");
	  double distanceFeet = input.nextDouble();
	  
	  // distance conversion in yards 
	  
	  double distanceYards = distanceFeet/3;
	  
	  // distance conversion in miles
	  
	  double distanceMiles = distanceYards/1760;
	  
	  System.out.println("Distance in yards is " + distanceYards + " while in miles is " + distanceMiles + " and in feet is " + distanceFeet);
   }
 }