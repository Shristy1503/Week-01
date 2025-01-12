import java.util.Scanner;
   public class FindLargestDigits{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // To store digits create and array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // store digits in the array after extracting it 
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        // create variables to store the largest and second the largest digits
        int largest = 0;
        int secondLargest = 0;

        // calculate to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("The largest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);
     }
   }
