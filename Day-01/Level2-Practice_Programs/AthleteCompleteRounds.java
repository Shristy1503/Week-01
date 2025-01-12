import java.util.*;
    public class AthleteCompleteRounds{
	  public static void main(String[]args){
	   Scanner input = new Scanner(System.in); 
	   System.out.println("Enter side 1 ");
	   double side1 = input.nextDouble();
	   System.out.println("Enter side 2 ");
	   double side2 = input.nextDouble();
	   System.out.println("Enter side 3 ");
	   double side3 = input.nextDouble();
	   
	   //first calculate the perimeter of triangular park
	   
	   double perimeter = side1 + side2 + side3;
	   
	   // conversion of 5km to meters
	   double distanceMeter = 5000;
	   
	   //calculating the number of rounds required to complete
	   int round = (int)(distanceMeter/perimeter);
	   
	   //check if remaining reminder then add another round 
	     if(distanceMeter % perimeter != 0){
	      round += 1;
	     }
		 
		System.out.println("The total number of rounds the athlete will run is " + round + " to complete 5 km");
	   }
	}
	   
	   