import java.util.Scanner;
  public class StringReversal{
    public static void main(String[]args){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter a string: ");
	  String text = input.nextLine();
	  // cal method
	  reverseString(text);
	   
	}
	
	//method to reverse string
	public static void reverseString(String text){
	   String reversed = "";
	   for(int i = text.length()-1; i>= 0; i--){
	     reversed = reversed + text.charAt(i);
	   }
	   
	   System.out.println("Reversed string is : " + reversed);
	}
  }