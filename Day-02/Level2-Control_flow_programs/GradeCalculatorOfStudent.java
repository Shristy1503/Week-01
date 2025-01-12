import java.util.Scanner;

    public class GradeCalculatorOfStudent{

      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          // Input marks for three subjects
          System.out.print("Enter marks for Physics: ");
          int physics = input.nextInt();

          System.out.print("Enter marks for Chemistry: ");
          int chemistry = input.nextInt();

          System.out.print("Enter marks for Mathematics: ");
          int mathematics = input.nextInt();

          // Calculate average and percentage
          int totalMark = physics + chemistry + mathematics;
          double averageMark = totalMark / 3.0;
          double percent = (totalMark / 300.0) * 100;

          // Calcullate grade and remarks
          String grade, remarks;

          if (percent >= 80) {
             grade = "A";
             remarks = "Level 4, above agency-normalized standards";
          } else if (percent >= 70) {
             grade = "B";
             remarks = "Level 3, at agency-normalized standards";
          } else if (percent >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
          } else if (percent >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
          } else if (percent >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
          } else {
            grade = "R";
            remarks = "Remedial standards";
          }
 
            System.out.printf("Average Marks: %.2f%n", averageMark);
            System.out.printf("Percentage: %.2f%%%n", percent);
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);

       
        }
    }