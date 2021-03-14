package _43_Java_Generics.Generic_Class._1;

public class Main {
    public static void main(String[] args) {
        // khởi tạo 1 object từ KeyValue class
        // Long: số điện thoại ( K : lúc này được khai báo cụ thể là Long )
        // String: tên chủ số điện thoại ( V : lúc này được khai báo cụ thể là String )
        KeyValue<Long, String> entry = new KeyValue<Long, String>(84369310105L, "Tom");

        // Java hiểu kiểu trả về là Long
        Long numberPhone = entry.getKey();

        // Java hiểu kiểu trả về là String
        String name = entry.getValue();

        System.out.println("Phone: " + numberPhone + " - " + "Name: " + name);
    }
}
