import java.util.Scanner;
  public class CalendarDisplay {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for month and year
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();

        // to validate month input
        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a value between 1 and 12.");
            return;
        }

        // call method to display the calendar
        displayCalendar(year, month);
    }
	
    // create array to store month names
    private static final String[] MONTHS = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    // create array to store the number of days in each month
	//final method means cannot be changed here
    private static final int[] DAYS_IN_MONTH = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    // Method to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the first day of the month
    private static int getFirstDayOfMonth(int year, int month) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7;
    }

    // Method to display the calendar
    private static void displayCalendar(int year, int month) {
        System.out.println("\n  " + MONTHS[month - 1] + " " + year);
        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

        // Get the number of days in the month
        int daysInMonth = DAYS_IN_MONTH[month - 1];
        if (month == 2 && isLeapYear(year)) {
            daysInMonth = 29;
        }

        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(year, month);

        // Print initial spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("     ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%5d", day);

            // Move to the next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); // Move to a new line after printing the calendar
    }

    
}
