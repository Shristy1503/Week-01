import java.util.Scanner;
    public class ReturnCharacter{
       public static void main(String[]args){
	     Scanner input = new Scanner(System.in);
	     // taking user input for string 
	     System.out.println("Enter string : ");
         String string = input.next();
		 
		 // using built in method to create char array 
		 char[] BuiltInArray = string.toCharArray();
		 
		 // call user defined char array
		 char[] userDefinedArray = characterReturn(string);
		 
		 // compare result with both methods
		 boolean result = compareResult(BuiltInArray, userDefinedArray);
		 // display result
		   System.out.println("user defined characters: ");
		   for(int i=0;i<userDefinedArray.length;i++){
            System.out.print(userDefinedArray[i] + " " + "\n");
		   }
		   System.out.println("built-in method characters: ");
		   for(int i=0;i<BuiltInArray.length;i++){
            System.out.println(BuiltInArray[i] + " " + "\n");
		   }
		   System.out.println("Are both results simila ?: " + result);
	   }
	   
	   public static char[] characterReturn(String string){
	       char[] charArray = new char[string.length()];
		   for(int i=0;i<string.length();i++){
		   // extract character at index i and assign to charArray
		      charArray[i] = string.charAt(i);
		   }
 	       return charArray;
	   
	   }
	   
	   public static boolean compareResult(char[] BuiltInArray, char[] userDefinedArray){
	       
	    //compare the results from both 
	    if(BuiltInArray.length != userDefinedArray.length){
		  return false;
		}
		for(int i=0;i<BuiltInArray.length;i++){
		  if(BuiltInArray[i] != userDefinedArray[i]){
		    return false;
		  }
		}
		 return true;
	   }
    }	    