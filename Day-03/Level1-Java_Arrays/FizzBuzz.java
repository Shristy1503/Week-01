import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        // Check if the number is positive
        if (number < 0) {
            System.out.println("Error: Please enter a positive integer.");
            return; 
        }
        
        // Creating a String array to save the results
        String[] results = new String[number + 1]; 
       
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz"; // Multiple of both 3 and 5
            } else if (i % 3 == 0) {
                results[i] = "Fizz"; // Multiple of 3
            } else if (i % 5 == 0) {
                results[i] = "Buzz"; // Multiple of 5
            } else {
                results[i] = String.valueOf(i); // Save the number itself
            }
        }
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
        
    }
}