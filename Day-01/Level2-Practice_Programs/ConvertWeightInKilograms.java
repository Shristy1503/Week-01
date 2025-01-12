import java.util.*;
    public class ConvertWeightInKilograms{
	  public static void main(String[]args){
	   Scanner input = new Scanner(System.in); 
	   System.out.println("Enter weight in pounds: ");
	   double poundWeight = input.nextDouble();
	   
	   // conversion of weight in pounds to kilograms
	   
	   double kilogramsWeight = poundWeight/2.2;
	   System.out.println("The weight of the person in pound is " + poundWeight + " and in kg is " + kilogramsWeight );
	  }
	}