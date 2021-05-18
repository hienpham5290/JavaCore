package _43_Java_Generic._06_Array_Generic._01_ArrayGenericReflection;

import java.lang.reflect.Array;

public class GenericArrayConstructor<T> {
    private Class<T> clazz;
    private final int size = 10;

    private T[] array;

    public GenericArrayConstructor(Class<T> clazz) {
        this.clazz = clazz;
        array = (T[]) Array.newInstance(clazz, size);
    }

    public T[] getArray() {
        return array;
    }
}
