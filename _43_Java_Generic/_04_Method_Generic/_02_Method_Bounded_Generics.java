package _43_Java_Generic._04_Method_Generic;

public class _02_Method_Bounded_Generics {
    public static void main(String[] args) {
        System.out.println("max of: 4, 5, 6 - is: " +
                maximum(4, 5, 6));
        System.out.println("max of: 7.7, 8.8, 9.9 - is: " +
                maximum(7.7, 8.8, 9.9));
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            return max = y;
        }
        if (z.compareTo(max) > 0) {
            return max = z;
        }
        return max;
    }
}
