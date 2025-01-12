import java.util.Scanner;
   public class SpringSeasonMethod{
      public static void main(String[]args){
	    // Take input from command line
		int month = Integer.parseInt(args[0]);
		int dayOfMonth = Integer.parseInt(args[1]);
	    
        // method call
       boolean result = checkSpringSeason(month, dayOfMonth);	
       if(result){
		   System.out.println("It is Spring Season");
	   }	else {
		   System.out.println("It is not Spring Season.");
	   }   

	  }
	  
	  public static boolean checkSpringSeason(int month, int dayOfMonth){
	  
	     if(month >= 3 && month <= 6){
		     if((month == 3 && dayOfMonth >= 20 && dayOfMonth <= 31) ||
          		(month == 4 && dayOfMonth >= 1 && dayOfMonth <= 30) ||
				(month == 5 && dayOfMonth >= 1 && dayOfMonth <= 31) || 
				(month == 6 && dayOfMonth >= 1 && dayOfMonth <= 20)) {
				 return true;
				}
			 else{
			     return false;
				 }
	    }
		return false;
	  }
   }