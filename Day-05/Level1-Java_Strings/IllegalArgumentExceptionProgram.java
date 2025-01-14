  import java.util.Scanner;
    public class IllegalArgumentExceptionProgram{
	   public static void main(String[]args){
	      Scanner input = new Scanner(System.in);
		  System.out.println("Enter string");
		  String text = input.nextLine();
		  
		  // method call to generate exception IllegalArgumentException
		  try{
		     exceptionGenerator(text);
		  }catch(IllegalArgumentException e) {
		     System.out.println("Caught exception in main: " + e.getMessage());
		  }
          
          // method call to handle exception 
          System.out.println("\nHandling IllegalArgumentException:");
           exceptionHandlor(text);
	   }
	    // method to generate IllegalArgumentException exception
	   public static void exceptionGenerator(String text){
	     // Setting start index greater than end index for substring
		  // System.out.println("Substring: " + text.substring(7, 4));
		  System.out.println("Substring: " + text.substring(7, 4));
	   
	   }
	   
	    // method to handle the created exception of IllegalArgumentException
	   public static void exceptionHandlor(String text){
	       // try to use substring with invalid index
	      try{
		      //System.out.println("Substring: " + text.subString(7, 4));
			  System.out.println("Substring: " + text.substring(7, 4));
		  }catch(IllegalArgumentException e){
		      System.out.println("Caught IllegalArgumentException: " + e.getMessage());
		  } catch(RuntimeException e){
		     System.out.println("Caught RuntimeException: " + e.getMessage());
		  }
	   }
	}