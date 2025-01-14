import java.util.Scanner;
   public class SplitTextArray2D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String Text: ");
        String text = input.nextLine();

        String[] words = splitTextChatAt(text);
        String[][] wordLengthArray = createWordLengthArray(words);

        // Display the result in tabular format
        System.out.printf("%-20s %s\n", "Word", "Length");
        System.out.println("------------------------------");
        for (String[] pair : wordLengthArray) {
            System.out.printf("%-20s %d\n", pair[0], Integer.parseInt(pair[1]));
        }
    }

    // Method to split text into words
    public static String[] splitTextChatAt(String text) {
        String[] words = new String[100]; // Assume a max of 100 words for simplicity
        int wordCount = 0;
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            } else if (word.length() > 0) {
                words[wordCount++] = word.toString();
                word.setLength(0);
            }
        }

        // Add the last word if exists
        if (word.length() > 0) {
            words[wordCount++] = word.toString();
        }

        // Resize the array to match the number of words
        String[] result = new String[wordCount];
        System.arraycopy(words, 0, result, 0, wordCount);

        return result;
    }

    // Method to calculate the length of a string without using the length() method
    public static int calculateLength(String word) {
        int length = 0;
        for (char c : word.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] createWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(calculateLength(words[i]));
        }

        return result;
    }
}
