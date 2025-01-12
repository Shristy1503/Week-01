import java.util.Scanner;
   public class LeapYearSingleCondition{
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a year : ");
        int year = scanner.nextInt();
         
		 
		 // check if year is valid and using single if condition
        if ((year >= 1582) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
      }
   }