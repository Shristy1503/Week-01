import java.util.*;
  public class VolumeOfEarth{
	public static void main (String[]args){
		
		double radiusOfEarthInKm = 6378 ;
		//calculate volume of earth in km
		double volumeOfEarthInKm =  (4/3) * 3.14 * Math.pow(radiusOfEarthInKm,3);
		
		// calculate volume of earth in miles
		double volumeOfEarthInMiles = volumeOfEarthInKm*0.6;
		
		System.out.println("The volume of earth in cubic kilometers is " + volumeOfEarthInKm + " and cubic miles is " + volumeOfEarthInMiles);
		
	}
  }