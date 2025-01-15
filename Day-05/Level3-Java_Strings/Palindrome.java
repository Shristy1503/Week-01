import java.util.Scanner;
  public class Palindrome{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        // Convert to lower case for case-insensitive comparison
        text = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // Check palindrome using three logics
        boolean resultIterative = isPalindromeIterative(text);
        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean resultUsingArrays = isPalindromeUsingArrays(text);
        System.out.println("\nPalindrome Check Results:");
        System.out.println("--------------------------");
        System.out.println("Using Iterative Logic: " + (resultIterative ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Recursive Logic: " + (resultRecursive ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Arrays Logic: " + (resultUsingArrays ? "Palindrome" : "Not a Palindrome"));   
    }
	
	public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // palindrome using character arrays
    public static boolean isPalindromeUsingArrays(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = reverseString(text);

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static char[] reverseString(String text) {
        int length = text.length();
        char[] reversed = new char[length];

        for (int i = 0; i < length; i++) {
            reversed[i] = text.charAt(length - 1 - i);
        }
        return reversed;
    }
}