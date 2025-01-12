import java.util.*;
  public class SamAverageMarks{
    public static void main(String[]args){
	  int mathsMarks = 94;
	  int physicsMarks = 95;
	  int chemistryMarks = 96;
         // calculate sum of all subjects marks
	  int averageMarks = mathsMarks + physicsMarks + chemistryMarks;
         // calculating average percentage
	  Double averagePercentageMarks = averageMarks/3.0;
	  System.out.println("Sam's average mark in PCM is: " + averagePercentageMarks);
	}
  }