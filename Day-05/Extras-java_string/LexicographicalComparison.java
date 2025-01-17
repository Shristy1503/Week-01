import java.util.Scanner;
  public class LexicographicalComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the two strings
        System.out.println("Enter the first string: ");
        String string1 = input.nextLine();

        System.out.println("Enter the second string: ");
        String string2 = input.nextLine();

        // Compare the strings and display the result
        int result = compareStrings(string1, string2);
        if (result < 0) {
            System.out.println("\"" + string1 + "\" comes before \"" + string2 + "\" in lexicographical order.");
        } else if (result > 0) {
            System.out.println("\"" + string1 + "\" comes after \"" + string2 + "\" in lexicographical order.");
        } else {
            System.out.println("\"" + string1 + "\" is equal to \"" + string2 + "\" in lexicographical order.");
        }
    }

    // Method to compare two strings lexicographically
    public static int compareStrings(String string1, String string2) {
        int minLength = Math.min(string1.length(), string2.length());

        // Compare characters one by one
        for (int i = 0; i < minLength; i++) {
            char char1 = string1.charAt(i);
            char char2 = string2.charAt(i);

            if (char1 != char2) {
                return char1 - char2; // Return the difference in ASCII values
            }
        }

        // If all characters are the same, compare lengths
        return string1.length() - string2.length();
    }
}
