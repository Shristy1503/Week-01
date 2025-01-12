import java.util.Scanner;
    public class DivideChocolates{
	  public static void main(String[]args){
	   Scanner input = new Scanner(System.in); 
	   System.out.println("Enter number of chocolates ");
	   int numberOfchocolates = input.nextInt();
	   System.out.println("Enter number of children ");
	   int numberOfChildren = input.nextInt();
	   
	   //method call 
	   int[] result = divideChocolate(numberOfchocolates, numberOfChildren);
		// print the result array 
		System.out.println("The number of chocolates each child gets is " + result[0] + " and the number of remaining chocolates are " + result[1]);
	 }
	 
	 public static int[] divideChocolate(int numberOfchocolates, int numberOfChildren){
	       // dividing chocolates in children equally
	    int chocolatesPerhead = (numberOfchocolates/numberOfChildren);
		
	      // count the remaining chocolates that are not distributed
		int remainingChocolates = numberOfchocolates % numberOfChildren;     
	     
		 return new int[]{chocolatesPerhead, remainingChocolates};
	 }
	}
