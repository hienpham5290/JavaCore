package _43_Java_Generic._06_Array_Generic._01_ArrayGenericReflection;

public class Main {
    public static void main(String[] args) {
        GenericArrayConstructor<Integer> generic =
                new GenericArrayConstructor<>(Integer.class);
        Integer[] array = generic.getArray();
        array[0] = 10;
        array[9] = 90;
    }
}
