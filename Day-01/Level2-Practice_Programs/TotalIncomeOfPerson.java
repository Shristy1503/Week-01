import java.util.*;
    public class TotalIncomeOfPerson{
	  public static void main(String[]args){
	   Scanner input = new Scanner(System.in); 
	   System.out.println("Enter salary: ");
	   double salary = input.nextDouble();
	   System.out.println("Enter Bonus: ");
	   double bonus = input.nextDouble();
	   
	   // calculates the total income of person
	   double totalIncome = salary + bonus;
	   System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total income is INR " + totalIncome);
	 }
	}