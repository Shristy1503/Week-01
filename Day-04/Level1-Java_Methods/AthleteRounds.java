import java.util.Scanner;

public class AthleteRounds{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter side 1: ");
        double side1 = input.nextDouble();
        System.out.println("Enter side 2: ");
        double side2 = input.nextDouble();
        System.out.println("Enter side 3: ");
        double side3 = input.nextDouble();
        
        // Create object of class
        AthleteRounds object = new AthleteRounds();
        object.roundNumbers(side1, side2, side3);  // Correct method call
    }
    
    public void roundNumbers(double side1, double side2, double side3) {
        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;
        
        // Conversion of 5 km to meters
        double distanceMeter = 5000;
        
        // Calculate the number of rounds required to complete
        int round = (int) (distanceMeter / perimeter);
        
        // Check if there's a remainder and add another round if necessary
        if (distanceMeter % perimeter != 0) {
            round += 1;
        }
        
        // Print the result
        System.out.println("The total number of rounds the athlete will run is " + round + " to complete 5 km");
    }
}
