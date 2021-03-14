package _34_instanceof;

class Anima { }

class Animal extends Anima{ }

class Dog extends Animal { }

public class B_InstanceOfInheritance {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        System.out.println(dog1 instanceof Dog);
        System.out.println(dog1 instanceof Animal);
        System.out.println(dog1 instanceof Anima);
        System.out.println(dog1 instanceof Object);
    }
}
