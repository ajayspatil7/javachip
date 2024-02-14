package learnConcepts;

public class learnClassesObj {
    public static void main(String[] args) {

        Person james = new Person();

        james.name = "James Gosling";
        james.age = 78;
        james.sex = true;
        james.weight = 70.4;

        james.talk();
        james.walk();

    }
}
