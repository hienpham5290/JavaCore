package _36_String_Class;

public class Les1_string_literal_string_new {
    public static void main(String[] args) {
        String s1 = "Welcome"; // khai báo 1 đối tượng kiểu String tham chiếu đến instance là string literal trong pool
        char[] c = {'W','e','l','c','o','m','e'};
        String s2 = new String(c);
        String s3 = new String("Welcome");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("địa chỉ của 3 đối tượng s1, s2, s3");
        System.out.println(s1.getClass().hashCode());
        System.out.println(s2.getClass().hashCode());
        System.out.println(s3.getClass().hashCode());
    }
}
