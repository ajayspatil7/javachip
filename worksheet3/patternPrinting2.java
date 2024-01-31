package worksheet3;
import java.util.Scanner;

public class patternPrinting2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userInput = input.nextInt();

        for (int i = userInput; i >= 1; i--) {

            for (int j = userInput; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
