package co1;
import java.util.Scanner;


public class sumOfEnteredNumber {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between (0 - 1000) > ");
        int num = input.nextInt();

        if(num < 0 || num > 1000){
            System.out.println("Invalid Range");
            return;
        } else {

            int sum = 0;
            int original = num;

            while(num != 0){
                sum += num % 10;
                num /= 10;
            }

            System.out.println("The sum of " + original + " is " + sum);

        }
    }
}
