import java.util.Scanner;
  public class ArrayIndexOutOfBoundsExceptionProgram{

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Attempt to access an index larger than the array length
        System.out.println("Accessing index 50: " + names[50]);
    }

    // Method to demonstrate handling of ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            // Attempt to access an index larger than the array length
            System.out.println("Accessing index 50: " + names[50]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of names you want to input: ");
        int size = input.nextInt();
        input.nextLine(); 

        String[] names = new String[size];
        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            names[i] = input.nextLine();
        }

        // Call the method to generate the exception
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException:");
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }

        // Call the method to handle the exception
        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        handleException(names);
    }
}
