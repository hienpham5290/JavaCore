package _44_Collection_Framework._13_Deque_interface_and_ArrayDeque_class;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeAsStack {
    public static void main(String[] args) {
        // khởi tạo ArrayDeque
        Deque<String> arrayDeque = new ArrayDeque<>();

        // đẩy phần tử vào ArrayDeque
        arrayDeque.push("One");
        arrayDeque.push("Two");
        arrayDeque.push("Three");
        arrayDeque.push("Four");
        arrayDeque.push("Five");

        // in ra mảng ArrayDeque
        System.out.println(arrayDeque);

        // truy xuất và loại bỏ phần tử thêm vào sau cùng
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.pop());
    }
}
