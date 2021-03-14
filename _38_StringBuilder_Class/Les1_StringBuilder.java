package _38_StringBuilder_Class;

public class Les1_StringBuilder {
    public static void main(String[] args) {
        StringBuffer stringBuffer1 = new StringBuffer("Hello Java");
        StringBuffer stringBuffer2 = new StringBuffer("Hello Java");

        System.out.println(stringBuffer1 == stringBuffer2); // so sánh địa chỉ, 2 đối tượng có địa chỉ khác nhau
        System.out.println(stringBuffer1.compareTo(stringBuffer2)); // so sánh theo từ điển nội dùng của chuỗi
    }
}
