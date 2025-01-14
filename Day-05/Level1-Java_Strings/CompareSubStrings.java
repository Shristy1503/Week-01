import java.util.Scanner;
    public class CompareSubStrings{
       public static void main(String[]args){
	   Scanner input = new Scanner(System.in);
	   // taking user input for string and indexes
	   System.out.println("Enter string : ");
       String string = input.next();
	    System.out.println("Enter start index: ");
        int start = input.nextInt();
		System.out.println("Enter end index: ");
        int end = input.nextInt();
	  	   	    	   
	    String usingCharAt = subStringCharat(string, start, end);
	    
		// using in built substring method
		 String substringUsingBuiltIn = string.substring(start, end);
		
		System.out.println(" substring using charAt: " + usingCharAt );
		System.out.println("  substring using subString(start, end) method: " + substringUsingBuiltIn);
		   
		// compareing results of both the methods 
		boolean result = usingCharAt.equals(substringUsingBuiltIn);
		System.out.println("Are the substrings equal? " + result);
		
	   }
	   public static String subStringCharat(String string, int start, int end){
	   
	    // create substring using charAt() using string builder
		StringBuilder subString = new StringBuilder();
		for(int i=start; i<end;i++){
		  subString.append(string.charAt(i));
		}
		   return subString.toString();
	   }
	}