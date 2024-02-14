package worksheet4;
import java.util.Scanner;
import java.util.Arrays;

public class transposeMatrix {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the rows and columns of the matrix:");
    int rows=scanner.nextInt();
    int columns=scanner.nextInt();
        System.out.print("Enter the elements of the matrix:");
    int matrix[][]=new int[rows][columns];
    int transpose[][]=new int[columns][rows];
        for (int i=0;i<rows;i++){
        for (int j=0;j<columns;j++)
        {
            matrix[i][j]=scanner.nextInt();
            transpose[j][i]=matrix[i][j];
        }
    }
        System.out.println("The original matrix:");
        for(int i=0;i<rows;i++)
    {
        System.out.println(Arrays.toString(matrix[i]));
    }
        System.out.println("The transposed matrix:");
        for(int i=0; i<columns;i++)
    {
        System.out.println(Arrays.toString(transpose[i]));
    }
}}
