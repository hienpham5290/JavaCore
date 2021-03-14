package _37_StringBuffer_Class;

public class Les5_delete {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World, Hello Java, Hello Android");
        System.out.println(sb.length()); // 38

        sb.delete(5, 99); // chỉ số end vượt độ dài vẫn compile thành công
//        sb.delete(40, 99); // chỉ số start vượt độ dài chuỗi, exception sẽ xảy ra

        System.out.println(sb); // Hello
    }
}
