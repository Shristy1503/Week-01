import java.util.Scanner;
  public class NumberFormatExceptionProgram{

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // Attempt to parse an invalid number
        System.out.println("Parsed number: " + Integer.parseInt(text));
    }

    // Method to demonstrate handling of NumberFormatException
    public static void handleException(String text) {
        try {
            // Attempt to parse an invalid number
            System.out.println("Parsed number: " + Integer.parseInt(text));
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to parse as an integer: ");
        String text = input.nextLine();

        // Call the method to generate the exception
        System.out.println("\nGenerating NumberFormatException:");
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }

        // Call the method to handle the exception
        System.out.println("\nHandling NumberFormatException:");
        handleException(text);
    }
}
