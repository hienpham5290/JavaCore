package _44_Collection_Framework._13_Deque_interface_and_ArrayDeque_class;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeAsQueue {
    public static void main(String[] args) {
        // khởi tạo 1 ArrayDeque
        Deque<String> arrayDeque = new ArrayDeque<>();

        // thêm element vào ArrayDeque với phương thức như
        // tương ứng với các phương thức của Queue
        // thêm element vào cuối
        arrayDeque.offer("One");
        arrayDeque.offer("Two");
        arrayDeque.offer("Three");
        arrayDeque.offer("Four");
        arrayDeque.offer("Five");

        // in ra các phần tử của ArrayDeque như 1 array
        System.out.println(arrayDeque);

        // truy xuất và xóa bỏ phần tử đầu như 1 Queue
        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque.poll());
    }
}
