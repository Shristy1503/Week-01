import java.util.Scanner;

  public class CheckPrimeNumber{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = input.nextInt();

        // Variable to store if prime number
         boolean isPrime = true;

        // Check if the number is greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to number/2 to check other factors 
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; // Exit the loop
                }
            }
        }

        
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

    }
  }