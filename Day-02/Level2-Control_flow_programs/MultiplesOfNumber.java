import java.util.Scanner;

  public class MultiplesOfNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if given the number is positive
        if (number <= 0) {
            System.out.println("Enter a positive integer greater than 0.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

            // calculate using for loop and run it backward from 100 to 1
            for (int i = 99; i >= 1; i--) {
                // Check if i is a multiple of the number
                if (i % number == 0) {
                    System.out.println(i); 
                }
            }
        }
    }
}