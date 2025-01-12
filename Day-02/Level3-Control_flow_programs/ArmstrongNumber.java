import java.util.Scanner;
  public class ArmstrongNumber{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		
		//create variable for user input
		int number = input.nextInt(); 
		int sum = 0; //Creating variable sum and assign value 0
		int originalNumber = number ; 
		while(originalNumber!=0){
			int remainder = originalNumber%10; // last digit calculation
			// calculate cube of last digit
			int remainderCube = remainder*remainder*remainder; 
			sum += remainderCube; // adding in sum
			originalNumber = originalNumber/10;
		}
		if(number==sum){
			System.out.println( number +" is Armstrong Number");
		}
		else {
			System.out.println( number +" is not Armstrong Number");
		}
	}
  }