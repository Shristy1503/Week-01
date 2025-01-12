import java.util.Scanner;

public class BMICalculatorFor2DArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        // Define a 2D array to store height, weight, and BMI
        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];

        // Input height and weight, calculate BMI, and determine weight status
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            
            // Input height
            do {
                System.out.print("Height (in meters): ");
                personData[i][0] = input.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be positive. Please enter again.");
                }
            } while (personData[i][0] <= 0);
            do {
                System.out.print("Weight (in kg): ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be positive. Please enter again.");
                }
            } while (personData[i][1] <= 0);

            // Calculating BMI using formula
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }
        System.out.println("\nDetails of each person:");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height (m)", "Weight (kg)", "BMI", "Weight Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", 
                              personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        
    }
}