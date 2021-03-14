package _24_Public_AccessModifier.Pack_2;

import _24_Public_AccessModifier.Pack_1.Person;

public class Student24 {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setId(90);
        person1.setName("Quang Hien");

        System.out.println("ID\t\t: " + person1.getId());
        System.out.println("NAME\t: " + person1.getName());
    }
}
