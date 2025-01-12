import java.util.Scanner;
    public class MultiplicationTable{
	  public static void main(String[]args){
	     Scanner input = new Scanner(System.in);
		 System.out.println("Enter number  ");
		 int number = input.nextInt();
		 
		 // using for loop to print 6 to 9 multiple from a table
		 
		 for(int i =6;i<=9;i++){
		    System.out.println(number + " * " + i + " = " + (number*i)); 
		 }
	  }
    }	  