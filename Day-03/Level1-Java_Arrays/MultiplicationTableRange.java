import java.util.Scanner;
  public class MultiplicationTableRange{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for the multiplication table: ");
        int number = input.nextInt();

        // creating an array to store results for values from 6 to 9
        int[] multiplicationResult = new int[4];

        // Calculate the table for numbers 6 to 9
        for (int i = 0; i < multiplicationResult.length; i++) {
            multiplicationResult[i] = number * (6 + i);
        }
        System.out.println("Multiplication Table for " + number + " from 6 to 9:");
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (6 + i) + " = " + multiplicationResult[i]);
        }

    }
  }