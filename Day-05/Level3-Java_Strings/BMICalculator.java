import java.util.Scanner;
   public class BMICalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] heightWeightArray = new double[10][2];

        // Taking user input
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter the weight (kg) of person %d: ", i + 1);
            heightWeightArray[i][0] = input.nextDouble();

            System.out.printf("Enter the height (cm) of person %d: ", i + 1);
            heightWeightArray[i][1] = input.nextDouble();
        }

        //call bmi calculator method
        String[][] bmiResults = calculateBMI(heightWeightArray);

        // Displaying results method call
        displayResults(bmiResults);
    }
	
	public static String[][] calculateBMI(double[][] heightWeightArray) {
        String[][] resultArray = new String[10][4];

        for (int i = 0; i < heightWeightArray.length; i++) {
            double weight = heightWeightArray[i][0];
            double heightInCm = heightWeightArray[i][1];
            double heightInMeters = heightInCm / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            resultArray[i][0] = String.format("%.2f", heightWeightArray[i][1]); // Height
            resultArray[i][1] = String.format("%.2f", heightWeightArray[i][0]); // Weight
            resultArray[i][2] = String.format("%.2f", bmi); // BMI
            resultArray[i][3] = status; // Status
        }

        return resultArray;
    }
	
	// Method to display the results
    public static void displayResults(String[][] bmiResults) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------");
        for (String[] person : bmiResults) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", person[0], person[1], person[2], person[3]);
        }
    }

}
