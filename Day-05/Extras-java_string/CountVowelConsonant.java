import java.util.Scanner;
  public class CountVowelConsonant{
    public static void main(String[]args){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter a string: ");
	  String text = input.nextLine();
	  
	  // convert string to lower case
	   text = text.toLowerCase();
	   
	   int vowelCount = 0, consonantCount = 0;
       
       // for loop to iterate through string
       	for(int i=0;i < text.length();i++){
		  char text1 = text.charAt(i);
		  
		  if(text1 == 'a' || text1 == 'e' || text1 == 'i' || text1 == 'o' || text1 == 'u'){
		    vowelCount++;
		  }else if(text1 >= 'a' && text1 <= 'z'){
		    consonantCount++;
		  }
		}   
		
		// display result 
		System.out.println("Number of vowel is: " + vowelCount);
		System.out.println("Number of consonant is: " + consonantCount);
	    
	}
  }