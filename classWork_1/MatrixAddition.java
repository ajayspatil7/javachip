package classWork_1;
import java.util.Scanner;



public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dimensions of matrix
        System.out.print("Enter the Rows : ");
        int rows = scanner.nextInt();
        System.out.print("Enter the Columns : ");
        int columns = scanner.nextInt();

        // Create arrays to store the matrices
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] sumMatrix = new int[rows][columns];

        // Input elements of the first matrix
        System.out.println("Elements of the first matrix : ");
        inputMatrixElements(scanner, matrix1);

        // Input elements of the second matrix
        System.out.println("Elements of the second matrix : ");
        inputMatrixElements(scanner, matrix2);

        // Perform matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display the sum matrix
        System.out.println("Sum of the matrices:");
        displayMatrix(sumMatrix);

        scanner.close();
    }

    // Method to input matrix elements
    public static void inputMatrixElements(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to display matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
