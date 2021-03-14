package _43_Java_Generics.Generic_Class._2;

public class Test<T> {
    private T object;

    public Test(T object) {
        this.object = object;
    }

    public T getObject() {
        return this.object;
    }
}
