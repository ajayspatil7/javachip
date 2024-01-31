package activityset2;
import java.util.Scanner;

public class as2p2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No of rows : ");
        int rows = input.nextInt();

        for(int i = 1; i <= rows ; i++) {

            for (int j = 1; j <= rows - i ; j++) {
                System.out.print(" ");
            }

            for (int k = i; k >= 1 ; k--){
                System.out.print(k);
            }

            for(int l = 2; l <= i ; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
        
    }
}
