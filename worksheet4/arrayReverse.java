package worksheet4;
import java.util.Scanner;
import java.util.Arrays;

public class arrayReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size=scanner.nextInt();
        System.out.print("Enter array elements : ");

        int[] arr = new int[size];
        int[] reverse_arr = new int[size];

        for (int i=0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
            reverse_arr[size-i-1]=arr[i];
        }
        System.out.println("The original array : " +Arrays.toString(arr));
        System.out.println("The reversed array : " +Arrays.toString(reverse_arr));

    }

}
