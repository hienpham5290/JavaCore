package _43_Java_Generics.Generic_Wildcard._2_wildcard;

public abstract class Person {
    protected String name;
    protected int age;
    protected String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public abstract void say();
}
