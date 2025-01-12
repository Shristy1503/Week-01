import java.util.Scanner;
  public class FootballTeamHeight{
    public static void main(String[] args) {
        // Create a double array to hold the heights of 11 players
        double[] heights = new double[11];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the heights of 11 players (in meters):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
        }
        double sum = 0;
        for (double height : heights) {
            sum += height;
        }
        
        // Calculating the mean height
        double meanHeight = sum / heights.length;
        System.out.printf("The mean height of the football team is: %.2f meters%n", meanHeight);

    }
}