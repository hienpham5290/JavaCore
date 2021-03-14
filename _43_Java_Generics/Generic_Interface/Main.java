package _43_Java_Generics.Generic_Interface;

public class Main {
    public static void main(String[] args) {
        ImplementsGenericInterface<Integer> obj = new ImplementsGenericInterface<>();
        obj.someThing = "Jack";
        obj.anyThing = 1234;

        System.out.println(obj.doSomeThing());
        System.out.println(obj.doAnyThing());
    }
}
