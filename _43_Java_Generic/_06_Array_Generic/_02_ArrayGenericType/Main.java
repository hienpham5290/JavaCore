package _43_Java_Generic._06_Array_Generic._02_ArrayGenericType;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {10, 20, 30};
        GenericArrayType<Integer> generic = new GenericArrayType<>(array);
        Integer first = generic.getFirstElementInArray();
        Integer last = generic.getLastElementInArray();
        System.out.println("first: " + first);
        System.out.println("last: " + last);
    }
}
