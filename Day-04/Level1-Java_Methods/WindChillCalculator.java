import java.util.Scanner;
   public class WindChillCalculator{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = input.nextDouble();
		System.out.print("Enter speed of wind: ");
        double windSpeed = input.nextDouble();
         
        // object creation of the class
         WindChillCalculator object = new WindChillCalculator();
		 
        // Call trigonometric calculator function
        double result = object.calculateWindChill(temperature, windSpeed); 

        // Display the results 
        System.out.printf("The wind chill temperature is: %.2f°F%n", result);
        
    }
	
	  public double calculateWindChill(double temperature, double windSpeed){
	     double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed, 0.16);
	     return windChill;
    }
}
