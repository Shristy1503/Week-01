import java.util.Scanner;
public class CheckPrimeNumber{ 
    public static void main(String[] args) { 
  
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a number to check if it's prime: "); 
        int number = input.nextInt(); 
		
        // Call method to check if the number is prime
        boolean isPrime = checkPrime(number); 
        
        if (isPrime) { 
            System.out.println(number + " is a prime number."); 
        } else { 
            System.out.println(number + " is not a prime number."); 
        } 
        
    }

    // Method to check if a number is prime
    public static boolean checkPrime(int number) { 
        // If number is less than 2, it's not prime
        if (number < 2) { 
            return false; 
        } 
        // Check divisibility by numbers from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) { 
            if (number % i == 0) { 
                return false; 
            } 
        } 
        return true; 
    }
}
