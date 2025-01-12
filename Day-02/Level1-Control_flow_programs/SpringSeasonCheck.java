import java.util.*;
   public class SpringSeasonCheck{
      public static void main(String[]args){
	    
		int month = Integer.parseInt(args[0]);
		int dayOfMonth = Integer.parseInt(args[1]);
		
		// Take input from command line 
		  if(month >= 3 && month <= 6){
		     if((month == 3 && dayOfMonth >= 20 && dayOfMonth <= 31) ||
          		(month == 4 && dayOfMonth >= 1 && dayOfMonth <= 30) ||
				(month == 5 && dayOfMonth >= 1 && dayOfMonth <= 31) || 
				(month == 6 && dayOfMonth >= 1 && dayOfMonth <= 20)) {
				 System.out.println("It is Spring Season");
				}
			 else{
			     System.out.println("It is not Spring Season");}
		  }
	  }
   }