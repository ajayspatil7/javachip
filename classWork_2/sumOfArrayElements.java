package classWork_2;
import java.util.Arrays;
import java.util.Scanner;

public class sumOfArrayElements {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Scanner arrayInput = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int arraySize = input.nextInt();

        int[] myArray = new int[arraySize];

        for(int i=0; i < arraySize; i++){
            myArray[i] = arrayInput.nextInt();
        }

        int arraySum = Arrays.stream(myArray).sum();
        System.out.println(arraySum);

    }

}
