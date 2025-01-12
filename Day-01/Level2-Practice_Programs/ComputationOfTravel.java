import java.util.*;

class ComputationOfTravel{
   
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
	  System.out.println("Enter name: ");
      String name = input.nextLine();
      
      /* Create variables fromCity, viaCity and toCity indicating city
       fromcity, viacity and tocity  */
	   System.out.println("Enter three locations : ");
      String fromCity = input.nextLine()  , viaCity = input.nextLine() , toCity = input.nextLine();

      // this variable show the distance between the fromCity to viaCity
	  System.out.println("Enter distance 1 : ");
      double distanceFromToVia = input.nextDouble();

      /* this variable show the time in minutes to travel taken to 
	  travel fromCity to viaCity in minutes */
      
      int timeFromToVia = 4 * 60 + 4;

      // show distance between the viaCity to toCity
	  System.out.println("Enter distance 2 : ");
      double distanceViaToFinalCity = input.nextDouble();

      // this show the time taken to travel from viaCity to toCity in minutes
      int timeViaToFinalCity = 4 * 60 + 25;

      // Create a variable totalDistance to indicate the total distance
     
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      /* Create a variable to indicate the total time taken to
      travel from fromCity to toCity in minutes */
      int totalTime = timeFromToVia + timeViaToFinalCity;


      
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
   }
}