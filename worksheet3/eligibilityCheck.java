package worksheet3;
import java.util.Scanner;

public class eligibilityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Age : ");

        int userAge = input.nextInt();

        if(userAge >= 18){
            System.out.println("You are eligible to Vote");
        } else {
            System.out.println("You are not eligible to Vote");
        }

    }
}
