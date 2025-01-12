import java.util.Scanner;
  public class FriendsComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Arrays to store names, ages, and heights
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter the height (in cm) of " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }

        // Create an object of FriendsComparison to call methods
        FriendsComparison object = new FriendsComparison();

        // Find the youngest and tallest friend
        String youngest = object.findYoungest(names, ages);
        String tallest = object.findTallest(names, heights);

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }
	
	// Method to find the youngest among the friends
    public String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        int result = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                result = i;
            }
        }

        return names[result]; 
    }
	
	// Method to find the tallest among the friends
    public String findTallest(String[] names, double[] heights) {
        double maxHeight = heights[0];
        int result = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                result = i;
            }
        }

        return names[result]; 
    }
}
