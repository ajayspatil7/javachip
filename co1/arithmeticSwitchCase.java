package co1;
import java.util.Scanner;

public class arithmeticSwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Enter which operation you want to Perform");
        System.out.print("1.ADD\n2.Subtract\n3.Multiply\n4.Divide\n> ");
        int userInput = input.nextInt();



        System.out.print("Enter first number : ");
        int x = input.nextInt();

        System.out.print("Enter second number : ");
        int y = input.nextInt();


        switch (userInput){

            case 1:
                System.out.print(x + y);
                break;

            case 2:
                System.out.print(x - y);
                break;

            case 3:
                System.out.print(x * y);
                break;

            case 4:
                if(y == 0){
                    System.out.print("Cannot divide any number by zero");
                    break;
                } else{
                    System.out.print(x / y);
                    break;
                }
            default:
                System.out.println("Unsupported Option");
                break;
        }

    input.close();
    }
}
