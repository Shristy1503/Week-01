import java.util.Scanner;
   public class ReverseTheNumber{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // calculate and count the digits in the number
        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Create an array to store the digits
        int[] digits = new int[count];
        int index = 0;

        while (number != 0) {
            digits[index] = number % 10; 
            number /= 10; 
            index++;
        }

        // Creating an array for storing the digits in reverse order
        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        // to display the reversed number
        System.out.print("The reversed number is: ");
        for (int digit : reversedDigits) {
            System.out.print(digit);
        }
        System.out.println();
     }
  }
