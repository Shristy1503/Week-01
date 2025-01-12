import java.util.Scanner;
    public class NumberChecker{
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter number ");
        int number = input.nextInt();
        
        NumberChecker checkNumber = new NumberChecker();
		int result = checkNumber.checkTheNumber(number);
		
		// check the result for positive, negative, zero
		
		if(result == 1){
			System.out.println("The number is positive ");
		}else if(result == -1){
			System.out.println("The number is negative ");
		}else {
			System.out.println("The number is zero");
		}
	  }
	  
	  public int checkTheNumber(int number){
	    if(number > 0){
		  return 1;
		}else if(number == 0){
		  return 0;
		}else {
		  return -1;
		}
	   }
	}
