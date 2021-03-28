package _44_Collection_Framework._12_Queue_interface_and_PriorityQueue_class;

// cài đặt class implements Comparable, làm tiêu chí so sánh sắp xếp phần
// tử cho hàng đợi ProrityQueue

import java.util.PriorityQueue;
import java.util.Queue;

class Book implements Comparable<Book> {
    private int id;
    private String
            name, author, publisher;
    private int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", author=" + author +
                ", publisher=" + publisher + ", quantity=" + quantity +"]";
    }
    @Override
    public int compareTo(Book o) {
        if (id < o.id) {
            return -1;
        } else if (id == o.id) {
            return 0;
        } else return 1;
    }
}
public class Queue_with_PriorityQueue_by_UserDataType {
    public static void main(String[] args) {
        // khởi tạo PriorityQueue
        Queue<Book> bookQueue = new PriorityQueue<>();

        // tạo các đối tượng Book
        Book b1 = new Book(333, "Let us C", "Yashwant Kanetkar",
                "BPB", 8);
        Book b2 = new Book(222, "Operating System", "Galvin",
                "Wiley", 6);
        Book b3 = new Book(111, "Data Communications & Networking",
                "Forouzan", "Mc Graw Hill", 4);

        // thêm đối tượng Book vào hàng đợi
        bookQueue.add(b1);
        bookQueue.add(b2);
        bookQueue.add(b3);

        // duyệt qua hàng đợi (queue) bằng for-each
        System.out.println("Use for-each to retrieve queue");
        for (Book b : bookQueue) {
            System.out.println(b);
        }
        System.out.println("queue - empty: " + bookQueue.isEmpty());
        System.out.println("Use E poll() method to get & remove first element in queue");
        System.out.println(bookQueue.poll());
        System.out.println(bookQueue.poll());
        System.out.println(bookQueue.poll());
        System.out.println("queue - empty: " + bookQueue.isEmpty());
    }
}
