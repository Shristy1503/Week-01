import java.util.Scanner;
  public class ArraySum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite loop to take user input
        System.out.println("Enter numbers (up to 10). Enter 0 or a negative number to stop:");
        while (true) {
            // Take user input
            double num = input.nextDouble();

            if (num <= 0 || index == 10) {
                break;
            }

            // Store the number in the array 
            numbers[index] = num;
            index++;
        }

        // Calculate total sum 
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display all entered numbers
        System.out.println("Entered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
       System.out.println("Total sum of entered numbers: " + total);
		
    }
}
