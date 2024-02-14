package class_work_7;

import java.util.Random;

public class Student {

    int USN;
    String NAME, DEPT, COLLEGE;


    void insert_Values(int usn, String name, String dept, String college){
        USN = usn;
        NAME = name;
        DEPT = dept;
        COLLEGE = college;
    }


    public static void main(String[] args) {
        Sports s1 = new Sports();
    }


}

class test extends Student{
    int[] MARKS = {};
    float total, average;

    void insertMarks(int[] marks){
        System.arraycopy(MARKS, 0, marks, 0, marks.length);
    }

}

class Sports extends test{
    String student_name;
    String winner, runner;



    void display(){
        System.out.println();
    }

}
