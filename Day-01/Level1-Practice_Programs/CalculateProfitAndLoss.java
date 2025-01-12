import java.util.*;
 public class CalculateProfitAndLoss{
   public static void main(String[]args){
    double costPrice = 129;
	double sellingPrice = 191;
        // calculate profit amount
	double profitNumber = sellingPrice - costPrice;
       // calculate profit percentage
	double profitPercentage = (profitNumber/costPrice)*100; 
	System.out.printf("The cost price is INR " + costPrice + " and selling price is INR " + sellingPrice  + " The profit is INR "+ profitNumber+ " and the profir percentage is "+ profitPercentage);
  }
 }