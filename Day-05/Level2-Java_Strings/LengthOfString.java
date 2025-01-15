import java.util.Scanner;
  public class LengthOfString{	
	public static void main(String[]args){
		//Scanner object
		Scanner input = new Scanner (System.in);
		//creating variable to take user input
		System.out.print("Enter string : ");
		String str = input.nextLine().trim();
	
		int length = calculateLength(str);
		//Printing Length
		System.out.println("The length of string is : "+ length);
	}
	
	//creating method calculateLength to calculate length of given string
	public static int calculateLength(String str){
		int count = 0;
		//using StringIndexOutOfBoundsException to find length of string
		try{
			while(true){
				str.charAt(count);
				count ++;
			}
		}
		catch(StringIndexOutOfBoundsException e){
			return count;
		}
	}
}