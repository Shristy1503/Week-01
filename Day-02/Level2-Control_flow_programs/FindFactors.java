import java.util.Scanner;

  public class FindFactors{
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for the number
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if(number <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else{
            System.out.println("Factors of " + number + " are:");

            // Run a for loop to find factors
            for (int i = 1; i < number; i++) {
                // Check if the number is perfectly divisible by i
                if (number % i == 0) {
                    System.out.println(i); // Print the factor
                }
            }
            
            System.out.println(number); 
        }
     }
  }