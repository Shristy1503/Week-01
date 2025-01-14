import java.util.Scanner;
 public class StringIndexOutOfBoundsExceptionProgram{
    public static void main(String[]args){
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter string : ");
	 String text = input.nextLine();
	 
     // method call for generating exception
       System.out.println("\nGenerating StringIndexOutOfBoundsException : "); 
	   try{
	      exceptionGeneration();
	   } catch (StringIndexOutOfBoundsException e){
	       System.out.println("Caught exception in main: " + e.getMessage());
	   }
	   
	   // method call to handle exception
	    System.out.println("\nHandling StringIndexOutOfBoundsException");
		handleTheException(text);
	}
	 // method to generate exception StringIndexOutOfBoundsException
	public static void exceptionGeneration(String text){
	  ////access the index of string at index beyond length of string(100) 
	  System.out.println("character at index 100 of string is: " + text.charAt(100));
	}
	
	public static void handleTheException(String text){
	 // method to handle exception of StringIndexOutOfBoundsException
	  try{
	     //try to access the index of string at index beyond length of string(100)  
	     System.out.println("Character at index 100: " + text.charAt(100));
	  } catch(StringIndexOutOfBoundsException e){
	     System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage(); 
	  }
	}
	
	
 }
