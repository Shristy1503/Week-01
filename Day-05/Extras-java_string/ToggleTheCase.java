import java.util.Scanner;

public class ToggleTheCase{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = input.nextLine();

        // Call the method to toggle the case of characters
        String toggledText = toggleCase(text);
        System.out.println("Toggled case string: " + toggledText);
    }

    // Method to toggle the case of each character
    public static String toggleCase(String text) {
        StringBuilder toggledString = new StringBuilder();

        // Iterate through the string and toggle each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            char toggledChar = toggleCharacter(currentChar);
            toggledString.append(toggledChar);
        }

        return toggledString.toString();
    }

    // Method to toggle the case of a single character
    public static char toggleCharacter(char ch) {
        if (Character.isUpperCase(ch)) {
            return Character.toLowerCase(ch); // Convert uppercase to lowercase
        } else if (Character.isLowerCase(ch)) {
            return Character.toUpperCase(ch); // Convert lowercase to uppercase
        }
        return ch; // Non-alphabetic characters remain unchanged
    }
}
