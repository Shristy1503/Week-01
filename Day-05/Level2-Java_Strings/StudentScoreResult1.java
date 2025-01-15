import java.util.*;
 public class StudentScoreResult1{
   public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter number of students: ");
        int numberOfStudents = input.nextInt(); 
        int[][] scores = generateRandomScores(numberOfStudents);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);
        displayScorecard(scores, results, grades);
    }
	
	// Method to generate random 2-digit scores for Physics, Chemistry, and Maths
    public static int[][] generateRandomScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3]; // 2D array for PCM scores
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(101); // Physics score (0-100)
            scores[i][1] = random.nextInt(101); // Chemistry score (0-100)
            scores[i][2] = random.nextInt(101); // Maths score (0-100)
        }
        return scores;
    }
	
	// Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4]; // 2D array for total, average, percentage
        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100; // Total marks = 300
            results[i][0] = total; // Total
            results[i][1] = Math.round(average * 100.0) / 100.0; // Average rounded to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Percentage rounded to 2 decimal places
        }
        return results;
    }
	
	   // Method to calculate grades based on percentage
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 90) {
                grades[i] = "A+";
            } else if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B+";
            } else if (percentage >= 60) {
                grades[i] = "B";
            } else if (percentage >= 50) {
                grades[i] = "C";
            } else if (percentage >= 40) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }
        return grades;
    }
	
	// Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        System.out.println("---------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10.2f %-10.2f %-10.2f %-10s%n",
                    scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }
}