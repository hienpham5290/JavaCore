package _36_String_Class;

public class Les24_intern {
    public static void main(String[] args) {
        String s1 = new String("supernova"); // nằm trong heap
        String s2 = "supernova"; // nằm trong pool

        // chuyển chuỗi s1 vào pool, trả về cho method, nếu pool đã tồn tại chuỗi, trả về cho method từ pool
        String s3 = s1.intern(); // chuyển giá trị của s1 vào pool, sau đó s3 tham chiếu vào pool

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        System.out.println("s1 == s2 : " + (s1 == s2)); // khác tham chiếu
        System.out.println("s2 == s3 : " + (s2 == s3)); // cùng tham chiếu
    }
}
