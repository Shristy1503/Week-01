import java.util.Scanner;
    public class FriendsAgeComputor{
      public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
		System.out.print("Enter Amar age: ");
        int amarAge = input.nextInt();
		
		System.out.print("Enter Amar height in cm: ");
        double amarHeight = input.nextDouble();

        System.out.print("Enter Akbar age: ");
        int akbarAge = input.nextInt();
		
        System.out.print("Enter Akbar height in cm: ");
        double akbarHeight = input.nextDouble();

        System.out.print("Enter Anthony age: ");
        int anthonyAge = input.nextInt();
		
        System.out.print("Enter Anthony height in cm: ");
        double anthonyHeight = input.nextDouble();

        //find the youngest from three using if else 
        String youngestFriend;
        int youngestAge = amarAge;
        youngestFriend = "Amar";

        if (akbarAge < youngestAge) 
		{
            youngestAge = akbarAge;
            youngestFriend = "Akbar";
        }
        if (anthonyAge < youngestAge) 
		{
            youngestAge = anthonyAge;
            youngestFriend = "Anthony";
        }

        //Find the tallest from three of them 
        String tallestFriend;
        double tallestHeight = amarHeight;
        tallestFriend = "Amar";

        if (akbarHeight > tallestHeight) 
		{
            tallestHeight = akbarHeight;
            tallestFriend = "Akbar";
        }
        if (anthonyHeight > tallestHeight) 
		{
            tallestHeight = anthonyHeight;
            tallestFriend = "Anthony";
        }

        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm.");

    }
  }