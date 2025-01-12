import java.util.Scanner;
   public class SumOfNaturalNumbers{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Enter a positive integer greater than zero.");
        } else {
            // method call
            int result = calculateSum(number);
            System.out.println("The sum of the first " + number + " natural numbers is: " + result);
        }
     }
	 
	  public static int calculateSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i; 
        }
        return sum;
     }
  }
