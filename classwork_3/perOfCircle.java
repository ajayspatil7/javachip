package classwork_3;


import java.util.Scanner;

public class perOfCircle {
    int radius;

    void assign(int rad){
        radius = rad;
    }

    double perimeter(){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        perOfCircle p = new perOfCircle();

        System.out.print("Enter radius : ");
        int r = input.nextInt();
        p.assign(r);

        System.out.print(p.perimeter());

    }


}
