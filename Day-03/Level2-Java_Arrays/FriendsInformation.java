import java.util.Scanner;
   public class FriendsInformation{
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store ages and heights of the friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Take user input for ages and heights
        System.out.println("Enter the ages and heights of Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Height of " + names[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        // calculating the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // calculating tallest friend
        int tallIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallIndex]) {
                tallIndex = i;
            }
        }
        System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex] + ".");
        System.out.println("The tallest friend is " + names[tallIndex] + " with height " + heights[tallIndex] + " cm.");
     }
  }
