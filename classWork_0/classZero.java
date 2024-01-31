package classWork_0;

public class classZero {
    public static void main(String[] args){

        // Question 1 : Print hello world in Java!
        System.out.println("Hello, world!!");

        // Question 2 : Initialise and print Int, Float, Char values in variable
        int age = 10;
        double gpa = 8.7;
        char section = 'A';

        System.out.println(age);
        System.out.println(gpa);
        System.out.println(section);

        // Question 3 : Program to implement arithmetic values and print them
        int x = 5;
        int y = 10;

        System.out.println("Addition : " + (x + y));
        System.out.println("Subtraction : " + (x - y));
        System.out.println("Multiplication : " + (x * y));
        System.out.println("Division : " + (y / x));

        // Question 4 : Print name, roll no, department, college name
        String name = "Ajay S Patil";
        int roll_no = 14;
        String department = "CSE";
        String college_name = "RVU";

        System.out.println(name);
        System.out.println(roll_no);
        System.out.println(department);
        System.out.println(college_name);

        // Question 5 : Print avg marks of a student in sub m1, m2, m3, m4, m5 by assigning values
        double m1 = 80.5;
        double m2 = 100.0;
        double m3 = 75.5;
        double m4 = 60.5;
        double m5 = 50.5;

        int sum = (int) (m1 + m2 + m3 + m4 + m5);
        double avg = (double) sum / 5;
        System.out.println(avg);


    }
}
