package worksheet4;
import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = scanner.nextInt();

        System.out.print("Enter the array elements : ");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int maximum = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        System.out.println("The largest element in the array is: " + maximum);

    }
}
