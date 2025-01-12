import java.util.Scanner;
  public class StudentVoteChecker{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // create an array to store ages of 10 students
        int[] ages = new int[10];
		
        StudentVoteChecker checker = new StudentVoteChecker();
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            // Calling canStudentVote method and display the result
            boolean canVote = checker.canStudentVote(ages[i]);
            if (ages[i] < 0) {
                System.out.println("Invalid age: Cannot vote.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " is not eligible to vote.");
            }
        }
    }
	
	 
	public boolean canStudentVote(int age){
        if (age >= 18) { 
            return true;
        } else
            return false; 
    }
}
