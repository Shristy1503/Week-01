 import java.util.Scanner;
    public class CompareStrings{
       public static void main(String[]args){
	   Scanner input = new Scanner(System.in);
	   // taking user input for both strings
	   System.out.println("Enter string 1: ");
       String string1 = input.next();
	   System.out.println("Enter string 2: ");
       String string2 = input.next();	   
	   
	   
	    boolean usingCharat = compareCharat(string1, string2);
	    
		// using equal() method
		boolean usingEqual = string1.equals(string2);
		
		System.out.println(" compare using charAt: " +  usingCharat);
		System.out.println(" compare using equals(): " +  usingEqual);
		   
		// compareing results of both the methods 
		 if(usingCharat == usingEqual){
		   System.out.println(" Both reuslts match ");
		 } else 
		   System.out.println(" Both reuslts do not match ");
		    
		}
	   
	   public static boolean compareCharat(String string1, String string2){
	   
	    // check if length of both string are equal
		if(string1.length() != string2.length()){
		   return false;
		}
		// using chatAt method to compare strings
		for(int i=0;i<string1.length();i++){
		   if(string1.charAt(i) != string2.charAt(i)){
		     return false;
		   } 
		}
		   return true;
	   }
	}