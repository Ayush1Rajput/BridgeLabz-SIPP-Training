import java.util.*;

public class MatrixToOneDArray {
    public static void main(String[] args) {

        // creating the scanner class
        Scanner sc = new Scanner(System.in);

        // getting user input for rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        // creating a 2D array (matrix)
        int[][] matrix = new int[rows][columns];

        // getting input for the 2D array
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // creating 1D array of size rows * columns
        int[] array = new int[rows * columns];
        int index = 0;

        // copying elements from 2D to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // displaying the 1D array
        System.out.println("Elements copied from 2D array to 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // closing the scanner class
        sc.close();
    }
}
