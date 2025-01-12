import java.util.*;
 public class CalculateTotalPrice{
   public static void main(String[]args){
    Scanner input = new Scanner(System.in);
	  System.out.println("Enter unit price: ");
	  double unitprice = input.nextDouble();
	  System.out.println("Enter quantity: ");
	  double quantity = input.nextDouble();
	  // calculating total purchase 
	  double totalPurchase = unitprice*quantity;
	  System.out.println("The total purchase price is INR " + totalPurchase + " if the quantity " + quantity + " and unit price is INR "+ unitprice);
   }
 }