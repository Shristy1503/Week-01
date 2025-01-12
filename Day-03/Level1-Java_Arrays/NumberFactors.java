import java.util.Scanner;
  public class NumberFactors{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int number = input.nextInt();
        int maxFactor = 10; // Initial size of the factors array
        int[] factors = new int[maxFactor]; // Array to store factors
        int index = 0; 
        
        // Find the factors of the number by calculating
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // Check if i is a factor
                
                if (index == maxFactor) {
                    // Double the size of the factors array
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
					
                    // Copy the previous factors in new array
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp; // Assign the new array to factors
                }
                factors[index] = i; // Store the factor
                index++; // Increment the index
            }
        }
        
        
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println(); // New line
    }
  }