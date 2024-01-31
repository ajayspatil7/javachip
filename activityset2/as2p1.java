package activityset2;
import java.util.Scanner;

public class as2p1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int arraySize = input.nextInt();

        int[] array = new int[arraySize];


        for(int i = 0; i < arraySize; i++) {
            System.out.print("Enter array elements : ");
            int arrElements = input.nextInt();
            array[i] = arrElements;
        }

        for(int i = 0; i < arraySize; i++) {
            System.out.println(array[i]);
        }




    }
}
