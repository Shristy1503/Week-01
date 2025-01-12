import java.util.*;
 public class UserInputDiscountInFees{
   public static void main(String[]args){
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter fees: ");
       double fees = input.nextDouble();
	   System.out.println("Enter discount percent: ");
       double discountPercent = input.nextDouble();
	
	   // calculate discount amount
	   double discount = (discountPercent/100)*fees;
	
	   // final discounted fees
	  double discountedFees = fees-discount; 
	  System.out.println("The discount amount is INR " + discount+" and final discounted fees is INR " + discountedFees );
   }
 }