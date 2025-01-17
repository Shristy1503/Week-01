import java.util.Scanner;

public class LongestWordFinder{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String text = input.nextLine();

        // Call the method 
        String longestWord = findLongestWord(text);
        System.out.println("The longest word is: " + longestWord);
    }

    // Method to find the longest word 
    public static String findLongestWord(String text) {
        String[] words = text.split(" "); 
        String longestWord = "";
        
        for (String word : words) {
            // Update longestWord if the current word is longer
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}
