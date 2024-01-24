
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class positiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int userInput = input.nextInt();

        if(userInput > 0){
          System.out.println(userInput + " is a Positive Number");
        } else if (userInput < 0) {
            System.out.println(userInput + " is a Negative Number");
        } else {
            System.out.println(" it is either a Zero or Wrong Input!");
        }


    }
}