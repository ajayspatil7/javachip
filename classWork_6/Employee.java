package classWork_6;

public class Employee {

    String name, jobTitle;
    double basic, hra, da;

    int incentive;

    Employee(String name, String jobTitle, double b, double h, double d, int i ){
        this.jobTitle = jobTitle;
        this.basic = b;
        this.hra = h;
        this.da = d;
        this.incentive = i;
    }

    Employee(String name, String jobTitle, double b, double h, double d){
        this.name = name;
        this.jobTitle = jobTitle;
        this.basic = b;
        this.hra = h;
        this.da = d;
    }

    void Salary(String name, String label){
        double sal = (this.basic + (0.12 * this.basic) + (0.05* this.basic) + this.incentive);
        System.out.println(name + " " + label + " " + sal);
    }

    void Salary(String name){
        double sal = (this.basic + (0.12 * this.basic) + (0.05 * this.basic));
        System.out.println(name + " " + sal);
    }


}
