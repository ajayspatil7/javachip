package classWork;


public class Student {

    int studentID;
    int studentAge;
    String studentName;
    String studentSection;

    int isEligible(int age){
        if (age >= 18){
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        // Student 1 details
        student1.studentName = "Rob";
        student1.studentAge = 19;
        student1.studentID = 104;
        student1.studentSection = "A";

        // Student 2 details
        student2.studentName = "Bob";
        student2.studentAge = 15;
        student2.studentID = 109;
        student2.studentSection = "C";

        // Call the isEligible Function
        int eligibility1 = student1.isEligible(student1.studentAge);
        int eligibility2 = student2.isEligible(student2.studentAge);

        // Print eligibility
        System.out.println(eligibility1);
        System.out.println(eligibility2);
    }
}

