import java.util.Scanner;
  public class HarshadNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
        // Store the original number to check after
        int originalNumber = number;
        int sum = 0;

        // using while Loop to calculate the sum of the digits
        while (number > 0) {
            int digit = number % 10; 
            sum += digit; 
            number /= 10; 
        }
        // Checking if original number is divisible by sum of it digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is Not a Harshad Number.");
        }
    }
  }
