import java.util.Scanner;

    public class BMICalculator{

       public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

           // Input: weight in kilograms and height in centimeters
           System.out.print("Enter weight in kg: ");
           double weightCentimeter = input.nextDouble();

           System.out.print("Enter height in cm: ");
           double heightCentimeter = input.nextDouble();

           // Convert height from cm to meters
           double heightMeters = heightCentimeter / 100;

           // Calculate BMI using the formula
           double calculateBmi = weightCentimeter / (heightMeters * heightMeters);

           // compute  weight status based on BMI
            String status;
            if (calculateBmi <= 18.4) {
               status = "Underweight";
            } else if(calculateBmi <= 24.9) {
               status = "Normal";
            } else if(calculateBmi <= 39.9) {
               status = "Overweight";
            } else {
               status = "Obese";
            }

        
          System.out.println("\n--- Results ---");
          System.out.printf("Your BMI: %.2f%n", calculateBmi);
          System.out.println("Weight Status: " + status);

        
        }
    }