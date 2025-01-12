import java.util.Scanner;
  public class CalculatorWithSwitch{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double first = input.nextDouble();

        System.out.print("Enter the second number: ");
        double second = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        String operation = input.next();

        // create variable fore result storage
        double result = 0;
        boolean isOperation = true;

        // Perform the operation using switch case
        switch (operation) {
            case "+":
                result = first + second; 
                break;
            case "-":
                result = first - second; 
                break;
            case "*":
                result = first * second; 
                break;
            case "/":
			
                // Check for division by zero
                if (second != 0) {
                    result = first / second; 
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    isOperation = false;
                }
                break;
            default:
                System.out.println("Invalid Operator");
                isOperation = false;
        }

        // Print the result if the operation is valid
        if(isOperation) {
            System.out.println("The result of " + first + " " + operation + " " + second + " is: " + result);
        }
    }
}
