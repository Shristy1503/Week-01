import java.util.Scanner;

public class FriendsComparison {

    // Method to find the youngest among the friends
    public String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        int index = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }

        return names[index]; // Return the name of the youngest friend
    }

    // Method to find the tallest among the friends
    public String findTallest(String[] names, double[] heights) {
        double maxHeight = heights[0];
        int index = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }

        return names[index]; // Return the name of the tallest friend
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store names, ages, and heights
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages and heights for the friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter the height (in cm) of " + names[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Create an object of FriendsComparison to call methods
        FriendsComparison comparison = new FriendsComparison();

        // Find the youngest and tallest
        String youngest = comparison.findYoungest(names, ages);
        String tallest = comparison.findTallest(names, heights);

        // Display the results
        System.out.println("\nThe youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }
}
