import java.util.Scanner;
   public class SmallestAndLargestNumber{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number2: ");
        int number2 = input.nextInt();
        System.out.print("Enter number3: ");
        int number3 = input.nextInt();
		
		/* method calling without creating object because
		static method and storing in result array */
		int[] result = findSmallestAndLargest(number1, number2, number3);
		
		System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);
		
	 }
	  public static int[] findSmallestAndLargest(int number1, int number2, int number3){
	     int smallestNumber, largestNumber;
		 
		 // checking for smallest number
		 if(number1 < number2 && number1 < number3){
		   smallestNumber = number1;
		 } else if(number2 < number3){
		   smallestNumber = number2;
		 } else {
	       smallestNumber = number3; 	 
		 }
		 
		 // checking for largest number
		 if(number1 > number2 && number1 > number3){
		   largestNumber = number1;
		 } else if(number2 > number3){
		   largestNumber = number2;
		 } else {
	       largestNumber = number3; 	 
		 }
		 
		 return new int[]{smallestNumber, largestNumber};
	 
	 }

   }