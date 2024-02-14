package classWork;

import java.util.Scanner;

public class MathModule {
    double areaOfTriangle(double breadth, double height){
        return 0.5 * breadth * height;
    }

    double areaOfRectangle(double length, double width){
        return length * width;
    }

    public static void main(String[] args) {

        MathModule mathX = new MathModule();

        double arOfTriangle = mathX.areaOfTriangle(10, 15);
        double arOfTriangle2 = mathX.areaOfTriangle(10, 15);

        double arOfRectangle = mathX.areaOfRectangle(5, 5);
        double arOfRectangle2 = mathX.areaOfRectangle(3, 9);

        System.out.println("Area of Triangle : " + arOfTriangle);
        System.out.println("Area of Triangle : " + arOfTriangle2);

        System.out.println("Area of Rectangle : " + arOfRectangle);
        System.out.println("Area of Rectangle : " + arOfRectangle2);
    }
}
