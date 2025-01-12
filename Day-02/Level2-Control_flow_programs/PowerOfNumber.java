import java.util.Scanner;

  public class PowerOfNumber{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // create variable for base number and the power
        System.out.print("Enter the base number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Initialize the result variable
        int result = 1;

        // Calculate the power using a for loop
        for (int i = 1; i <= power; i++) {
            result *= number; 
        }

        System.out.println(number + " raised to the power of " + power + " is: " + result);
		
     }
  }