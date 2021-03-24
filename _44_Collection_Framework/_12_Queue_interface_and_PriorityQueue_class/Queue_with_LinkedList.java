package _44_Collection_Framework._12_Queue_interface_and_PriorityQueue_class;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_with_LinkedList {
    public static void main(String[] args) {
        // khởi tạo 1 queue với instance của LinkedList (dùng LinkedList làm queue)
        Queue<String> stringQueue = new LinkedList<>();

        // offer(E) method để thêm phần tử
        // với LinkedList làm hàng đợi queue, phần tử sẽ được thêm vào cuối (tail)
        // return true : nếu thành công
        // return false : nếu hàng đợi không còn chỗ
        stringQueue.offer("A");
        stringQueue.offer("B");
        stringQueue.offer("C");

        // add(E) method để thêm phần tử
        // với LinkedList làm hàng đợi queue, phần tử sẽ được thêm vào cuối (tail)
        // return true : nếu thành công
        // Throw IllegalStateException nếu hàng đợi không còn chỗ
        stringQueue.add("D");
        stringQueue.add("E");

        while (true) {
            // E remove() hoặc E poll() method để lấy ra phần tử đầu tiên, đồng thời
            // xóa bỏ phần tử đó
            // E remove() ném ra ngoại lệ nếu hàng đợi rỗng
            // E poll()  return null nếu hàng đợi rỗng
            String stringQ = stringQueue.poll();
            if (stringQ == null) {
                break;
            }
            System.out.println("name= " + stringQ);
        }
        System.out.println();

        // kiểm tra hàng đợi LinkedList đã bị poll hết phần tử chưa
        System.out.println("Is queue empty? : " + stringQueue.isEmpty());
    }
}
