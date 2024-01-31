package co1;
import java.util.Scanner;


public class perimeterOfRect {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Length : ");
        double length = input.nextDouble();

        System.out.print("Enter the Width : ");
        double width = input.nextDouble();

        double perimeter = 2 * (length + width);
        System.out.print("The Perimeter is : " + perimeter);
    }
}
