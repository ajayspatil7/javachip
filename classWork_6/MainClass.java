package classWork_6;

public class MainClass {
    public static void main(String[] args) {

        // Without incentive
        Employee emp1 = new Employee("Steve jobs", "Founder", 999.999, 500.00, 500.00);

        // With incentive
        Employee emp2 = new Employee("Tim Cook", "CEO", 250.000, 150.000, 100.000, 150000);

        // Emp 1 Salary
        emp1.Salary("Tim cook");

        // Emp 2 Salary with X parameter
        emp2.Salary("Steve jobs", "Earns");
    }
}

