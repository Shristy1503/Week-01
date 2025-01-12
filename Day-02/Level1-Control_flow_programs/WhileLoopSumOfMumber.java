import java.util.Scanner;
    public class WhileLoopSumOfMumber{
	  public static void main(String[]args){
	    
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number ");
	    int number = input.nextInt();
		
		int sumFormula = 0, sumLoop = 0;
		//check if number is positive 
		
		if(number > 0){
		
		// calculating sum using formula
		   sumFormula = number * (number + 1)/2;
		// calculating sum using while loop 
		   sumLoop = 0;
		  
		  int i = 1;
		  while(i <= number){
		    sumLoop += i;
			i++;
		  }
		  System.out.println("Sum of number " + number + " using formula is " + sumFormula);
		  System.out.println("Sum of number " + number + " using loop is " + sumLoop);
		  
		}else 
		  System.out.println(number + "Number is not positive");
		  
		  // comparing both the values of sum
		  if(sumFormula == sumLoop){
		     System.out.println("The result matches");
		  }else 
		     System.out.println("The does not result matches");
	  }
	}