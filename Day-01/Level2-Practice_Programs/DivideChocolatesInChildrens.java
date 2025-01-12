import java.util.*;
    public class DivideChocolatesInChildrens{
	  public static void main(String[]args){
	   Scanner input = new Scanner(System.in); 
	   System.out.println("Enter number of chocolates ");
	   int numberOfChocolates = input.nextInt();
	   System.out.println("Enter number of children ");
	   int numberOfChildren = input.nextInt();
	   
	   // dividing chocolates in chindren equally
	    int chocolatesPerChildren = (numberOfChocolates/numberOfChildren);
		
	   // count the remaining chocolates that are not distributed
		int remainingChocolates = numberOfChocolates % numberOfChildren;
		
		System.out.println("The number of chocolates each child gets is " + chocolatesPerChildren + " and the number of remaining chocolates are " + remainingChocolates);
	 }
	}
	   