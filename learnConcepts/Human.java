package learnConcepts;

public class Human {

    String name;
    String company;
    int age;
    double weight;
    char sex;

    Human(String name, int age, char sex, double weight, String company){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.company = company;
        this.sex = sex;
    }



    void DisplayInfo(){
        switch (this.sex){
            case 'M':
                System.out.println(this.name + " created " + this.company + " at age " + this.age + " when he weighed " + this.weight);
            case 'F':
                System.out.println(this.name + " created " + this.company + " at age " + this.age + " when she weighed " + this.weight);

        }
    }

}
