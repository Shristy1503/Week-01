import java.util.*;
  public class AnagramOfStrings{
    public static void main(String[]args){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter a string 1: ");
	  String text1 = input.nextLine();
	  System.out.println("Enter a string 2: ");
	  String text2 = input.nextLine();
	  // cal the method
	 System.out.println("Is both strings anagrams: " + ifAnagram(text1, text2));
	  
    
	}
	
	public static boolean ifAnagram(String text1, String text2){
	   // convert both string to lower case
	  text1 = text1.toLowerCase();
	  text2 = text2.toLowerCase();
	  
      if(text1.length() != text2.length()){
	     return false;
	   }
        // convert string to car array
         char[] array1 = text1.toCharArray();  
         char[] array2 = text2.toCharArray();  	
	
		 // comparing both the array is they are equal
		 for(int i=0;i< array1.length;i++){
			 boolean found = false;
			 for(int j=0;j<array2.length;j++){
				 if(array1[i] == array2[j]){
					 found = true;
					 break;
				 }
			 }
			 if(!found){
				 return false;
			 }
		 }
		 return true; 
    }
  }	
  