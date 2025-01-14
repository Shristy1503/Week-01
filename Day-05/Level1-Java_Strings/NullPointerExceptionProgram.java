  public class NullPointerExceptionProgram{
    
	public static void main(String[] args) {
        // Call the method to for exception generation
        System.out.println("Generating NullPointerException:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }

        // Call the method to handle the exception
        System.out.println("\nHandling NullPointerException:");
        handleException();
    }

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; // Initializing the variable to null
        // This line will throw NullPointerException
        System.out.println(text.length());
    }

    // Method to show handling of NullPointerException
    public static void handleException() {
        String text = null; // Initializing the variable to null
        try {
            // Attempting to access a method on a null object
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

}
