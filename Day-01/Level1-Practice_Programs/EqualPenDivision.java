import java.util.*;
 public class EqualPenDivision{
   public static void main(String[]args){
    int totalPen = 14;
	int students = 3;

      /* calculate pen per person divided and the 
         remaining pen that is not divided */

	int penPerStudent = totalPen/students;    
	int remainingPen = totalPen%students;
	System.out.println("The pen per student is " + penPerStudent+" and the remaining pen not distributed is "+remainingPen);
   }
 }