package _44_Collection_Framework._13_Deque_interface_and_ArrayDeque_class;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeAsCollection {
    public static void main(String[] args) {
        // khởi tạo 1 Deque với instance của ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // add element vào Deque
        deque.add("BASIC");
        deque.add("OOP");
        deque.add("Collection");

        // sử dụng for-each truy xuất từng phần tử trong Deque
        for (String e : deque) {
            System.out.println(e);
        }
    }
}
