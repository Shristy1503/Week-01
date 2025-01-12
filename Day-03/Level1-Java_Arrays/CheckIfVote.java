import java.util.Scanner;
  public class CheckIfVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Student [] = new int[10];
        System.out.println(" Enter the Age of the 10 Student ");
		
		// inside loop check if students can vote
        for ( int i=0;i<Student.length;i++)
        {
            Student[i] = input.nextInt();
        }
        for (int i= 0 ; i< Student.length; i++ )
        {
            if(Student[i]<0)
            {
                System.out.println(" An invalid Age");
            }
            else if (Student[i]>=18)
            {
                System.out.println(" The Student with the age "+ Student[i] + " can vote");
            }
            else
            {
                System.out.println(" The student  with the age "+ Student[i] + " can not vote");
            }
        }
    }
}
