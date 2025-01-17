import java.util.Scanner;
  public class RemoveDuplicate{
    public static void main(String[]args){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter a string: ");
	  String text = input.nextLine();
	  // cal the method
	 String modified = removeDuplicate(text);
	 // display old string
	 System.out.println("original string is: " + text);
	 // display modifies string
	 System.out.println("modified string without duplicate characters is: " + modified);
	  
	    
	} 
	//method to remove duplicate character from string
	public static String removeDuplicate(String text){
	  // convert string to char array
	  String result = "";
	  
	  for(int i=0;i<text.length();i++){
		  char text1 = text.charAt(i);
		  if(result.indexOf(text1) == -1){
			  result += text1;
		  }
	  }
	  return result;
	}
  }