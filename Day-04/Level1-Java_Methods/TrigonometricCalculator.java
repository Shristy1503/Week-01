import java.util.Scanner;
   public class TrigonometricCalculator {
     public static void main(String[] args) {
        TrigonometricCalculator calculator = new TrigonometricCalculator();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double angle = input.nextDouble();

        // Call trigonometric calculator function
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        // Display the results 
        System.out.printf("Sine: %.4f%n", results[0]);
        System.out.printf("Cosine: %.4f%n", results[1]);
        System.out.printf("Tangent: %.4f%n", results[2]);
    }
	
	  public double[] calculateTrigonometricFunctions(double angle) {
	  
	    // inbuilt method to convert degrees to radian for sine, cosine and tangent
        double radians = Math.toRadians(angle); 
        double sine = Math.sin(radians);       
        double cosine = Math.cos(radians);     
        double tangent = Math.tan(radians);    

        return new double[]{sine, cosine, tangent}; 
    }
}
