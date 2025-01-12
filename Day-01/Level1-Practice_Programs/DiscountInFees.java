import java.util.*;
 public class DiscountInFees{
   public static void main(String[]args){
	   double fees = 125000;
           double discountPercent = 10;
	
	   // calculate discount amount
	   double discount = (discountPercent/100)*fees;
	
	   // final discounted fees
	  double discountedFees = fees-discount; 
	  System.out.println("The discount amount is INR " + discount+" and final discounted fees is INR " + discountedFees );
   }
 }