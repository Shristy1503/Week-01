import java.util.Scanner;
  public class MultiDimensionalArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();
        
        // Create a 2D array (matrix)
        int[][] matrix = new int[rows][columns];
        
        // Take user input to fill the 2D array
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
        
        // Create a 1D array to copy the elements of the 2D array
        int[] array = new int[rows * columns];
        int index = 0; 
        
        // Copy elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j]; 
                index++; 
            }
        }
        
        System.out.println("Elements in the 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); 
        
       
    }
}