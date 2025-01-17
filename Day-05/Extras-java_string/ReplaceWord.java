import java.util.Scanner;
  public class ReplaceWord{
    public static void main(String[]args){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter a string: ");
	  String text = input.nextLine();
	  System.out.println("Enter the word you want to be replaced: ");
	  String wordToReplace = input.nextLine();
	  System.out.println("Enter the new word ");
	  String replacedWord = input.nextLine();
	  
	  // cal the method
	  String result = wordReplacement(text, wordToReplace, replacedWord)
	  System.out.println("New sentence is: " + result);
	 
	}
	// method to replave the word
	public static String wordReplacement(String text, String wordToReplace, String replacedWord){
	  return text.replaceAll("\\b" + wordToReplace + "\\b", replacedWord);
	}
  }	