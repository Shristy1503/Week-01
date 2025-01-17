import java.util.Scanner;
  public class StringPalindrome{
    public static void main(String[]args){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter a string: ");
	  String text = input.nextLine();
	  // cal method
	  boolean isPalindrome = palindromeChecker(text);
	  System.out.println("Is the string palindrome: " + isPalindrome);
	    
	}
	 // method to check if string palindrome
	 public static boolean palindromeChecker(String text){
	   int start = 0;
	   int end = text.length() - 1;
	   while(start < end){
	     if(text.charAt(start) != text.charAt(end)){
		   return false;
		 }
		 start++;
		 end--;
	   }
	   return true;
	 }
	
  }