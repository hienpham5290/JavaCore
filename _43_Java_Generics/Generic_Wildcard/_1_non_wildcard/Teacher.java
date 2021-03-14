package _43_Java_Generics.Generic_Wildcard._1_non_wildcard;

public class Teacher extends Person {
    public Teacher(String name, int age, String address) {
        super(name, age, address);
    }
    @Override
    public void say() {
        System.out.println("I am teacher !!!");
    }
}
