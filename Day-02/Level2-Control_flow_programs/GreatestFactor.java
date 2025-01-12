import java.util.Scanner;
  public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Initialize the greatest factor variable
        int greatestFactor = 1;

        // Loop to find the greatest factor (other than the number itself)
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { // Check if divisible
                greatestFactor = i; // Assign the factor
                break; // Exit the loop
            }
        }
        // Output the greatest factor
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
    }
  }