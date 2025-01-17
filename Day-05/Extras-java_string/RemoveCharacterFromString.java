import java.util.Scanner;
  public class RemoveCharacterFromString{
    public static void main(String[]args){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter a string: ");
	  String text = input.nextLine();
	  System.out.println("Enter the character you want to be remove: ");
	  char character = input.next().charAt(0);
	  
      // call the method
      String modified = characterRemoval(text, character);
       System.out.println("Modified string is: " + modified);	  
	}
	
	public static String characterRemoval(String text, char character){
	  String result = "";
	  // check the character if exist in the string 
	  for(int i=0;i<text.length();i++){
	    if(text.charAt(i) != character){
		  result += text.charAt(i);
		}
	  }
	  return result;
	}
  }	