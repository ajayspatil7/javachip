package assignment_co2;
import java.util.Scanner;

public class Car {
    String companyName, modelName;
    int mileage, year;

    void assignValues(String name, String model, int mileage, int year){

        this.companyName = name;
        this.modelName = model;
        this.mileage = mileage;
        this.year = year;
    }

    void displayValues(){
        System.out.println("Car Name : " + this.companyName);
        System.out.println("Model Name : " + this.modelName);
        System.out.println("Mileage : " + this.mileage);
        System.out.println("Year : " + this.year);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the car name : ");
        String carName = input.nextLine();

        System.out.print("Enter the model name : ");
        String modelName = input.nextLine();

        System.out.print("Enter the car mileage : ");
        int mileage = input.nextInt();

        System.out.print("Enter the car year : ");
        int year = input.nextInt();


        car1.assignValues(carName, modelName, mileage, year);
        System.out.println("-------------------------------------------------------------");
        car1.displayValues();

    }

}
