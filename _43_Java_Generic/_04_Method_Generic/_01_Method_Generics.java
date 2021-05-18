package _43_Java_Generic._04_Method_Generic;

public class _01_Method_Generics {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("intArray:");
        PrintArray(intArray);

        System.out.println("doubleArray:");
        PrintArray(doubleArray);

        System.out.println("charArray:");
        PrintArray(charArray);
    }

    // khai báo 1 method in 1 mảng với bất kỳ kiểu dữ liệu
    // bằng cách sử dụng Generics
    public static <T> void PrintArray(T[] array) {
        for (T e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
