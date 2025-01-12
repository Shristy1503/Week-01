import java.util.Scanner;
  public class AbundantNumber{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;

        // use for Loop to find all the divisors of that number
        for (int i = 1; i < number; i++) {
            // Check if divisor 
            if (number % i == 0) {
                sum += i; // Add the divisor to the sum
            }
        }
        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }
    }
}
