import java.util.Scanner;
  public class RemoveFrequentCharacter{
    public static void main(String[]args){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter a string: ");
	  String text = input.nextLine();
	  
      // call the method
      char character = frequentCharacter(text);
       System.out.println("Most frequent character is: " + character);	  
	}
	
	public static char frequentCharacter(String text){
	  int maxCounter = 0;
	  char mostFrequent = text.charAt(0);
	 
	  // check the character if exist in the string 
	  for(int i=0;i<text.length();i++){
	     int localCount = 0;
		 char current = text.charAt(i);
		 
	     for(int j=0;j<text.length();j++){
		   if(text.charAt(j) == current){
		      localCount++;
		   }
		 }
		if(localCount > maxCounter){
		   maxCounter = localCount;
		   mostFrequent = current;
		}
	  }
	  return mostFrequent;
	}
  }	