import java.util.Scanner;
  public class SubstringCounter{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the main string
        System.out.println("Enter the main string: ");
        String mainString = input.nextLine();

        // Input the substring
        System.out.println("Enter the substring: ");
        String subString = input.nextLine();

        // Call the method to count occurrences
        int count = countOccurrences(mainString, subString);
        System.out.println("The substring occurs " + count + " times.");
    }

    // Method to count the occurrences of a substring
    public static int countOccurrences(String mainString, String subString) {
        int count = 0;
        int index = 0;

        // Use indexOf to find the substring within the main string
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length(); 
        }

        return count;
    }
}
