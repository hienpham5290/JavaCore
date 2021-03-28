package _44_Collection_Framework._12_Queue_interface_and_PriorityQueue_class;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_with_PriorityQueue_by_Wrapper {
    public static void main(String[] args) {
        // với hàng đợi (queue) với instance của PriorityQueue, các phần
        // tử kiểu Wrapper sẽ được sắp xếp theo trật tự tự nhiên của chúng
        // không phụ thuộc vào trình tự được thêm vào, mà phụ thuộc vào tính
        // chất của mỗi kiểu Wrapper
        Queue<String> namelist = new PriorityQueue<>();

        // offer(E) : thêm phần tử vào hàng đợi (queue)
        // return true : nếu thành công
        // return false : nếu hàng đợi không còn vị trí trống
        namelist.offer("E");
        namelist.offer("D");
        namelist.offer("C");

        // add(E) : thêm phần tử vào hàng đợi
        // return true : nếu thành công
        // Throw Exception : nếu hàng đợi không còn vị trí trống
        namelist.add("B");
        namelist.add("A");

        while (true) {
            // E poll() : truy xuất nội dung, đồng thời loại bỏ phần tử đầu tiên của queue
            // return phần tử kiểu E nếu thành công
            // return null : nếu không tìm thấy phần tử nào trong queue
            String name = namelist.poll();
            if (name == null) {
                break;
            }
            System.out.println("Name= " + name);
        }
    }
}
