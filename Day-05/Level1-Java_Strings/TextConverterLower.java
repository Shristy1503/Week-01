import java.util.Scanner;
   public class TextConverterLower{           
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the text: ");
        String userInput = scanner.nextLine();

        // Using built-in method to convert to lowercase
        String lowerCaseBuiltIn = userInput.toLowerCase();

        // Using manual method to convert to lowercase
        String lowerCaseManual = toLowerCaseManual(userInput);

        // Comparing the two strings
        boolean areEqual = compareStrings(lowerCaseBuiltIn, lowerCaseManual);

        // Displaying results
        System.out.println("Lowercase using built-in method: " + lowerCaseBuiltIn);
        System.out.println("Lowercase using manual method: " + lowerCaseManual);
        System.out.println("Are both lowercase results the same? " + areEqual);
     }
	
	// Method to convert text to lowercase manually
    public static String toLowerCaseManual(String text) {
        StringBuilder lowerCaseText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                lowerCaseText.append((char) (ch + 32));
            } else {
                lowerCaseText.append(ch);
            }
        }

        return lowerCaseText.toString();
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
