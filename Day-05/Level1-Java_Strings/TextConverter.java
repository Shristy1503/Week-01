import java.util.Scanner;
   public class TextConverter {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter text: ");
        String userInput = scanner.nextLine();

        // Using built-in method to convert to uppercase
        String upperCaseBuiltIn = userInput.toUpperCase();

        // Using user method to convert to uppercase
        String upperCaseManual = toUpperCaseManual(userInput);

        // Comparing the two strings
        boolean areEqual = compareStrings(upperCaseBuiltIn, upperCaseManual);

        // to display results
        System.out.println("Uppercase using built-in method: " + upperCaseBuiltIn);
        System.out.println("Uppercase using manual method: " + upperCaseManual);
        System.out.println("Are both uppercase results the same? " + areEqual);

       
    }
	
	// Method to convert text to uppercase manually
    public static String toUpperCaseManual(String text) {
        StringBuilder upperCaseText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                upperCaseText.append((char) (ch - 32));
            } else {
                upperCaseText.append(ch);
            }
        }

        return upperCaseText.toString();
    }
	
	// Method to compare two strings manually
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
