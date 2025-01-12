import java.util.Scanner;
    public class BonusOfEmployee{
	  public static void main(String[]args){
	     Scanner input = new Scanner(System.in);
		 System.out.println("Enter salary ");
		 double salary = input.nextDouble();
		 System.out.println("Enter year of service ");
		 double yearService = input.nextDouble();
		 
		 /* create variable to store bonus and 
		    check the time of service and provide bonus of 5 % */
           double bonus = 0;
           if(yearService > 5){
		      bonus = salary * 0.5;
		   }
		   
		   System.out.println("The bonus amount is " + bonus);
	  
	  }
	}
	    