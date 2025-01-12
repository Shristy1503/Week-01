import java.util.Scanner;
  public class FrequencyOfDigit{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String inputNumber = input.nextLine();
		// creating an array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];
		// Loop through each character in the input number
        for (int i = 0; i < inputNumber.length(); i++) {
            char digitChar = inputNumber.charAt(i);
           
            if (Character.isDigit(digitChar)) {
                int digit = Character.getNumericValue(digitChar);
                frequency[digit]++;
            }
        }
		
        System.out.println("Frequency of each digit in the number:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
	}
}