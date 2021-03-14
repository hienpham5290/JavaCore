package _38_StringBuilder_Class;

public class Les3_hashCode_test {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println("string trước : " + str.hashCode()); // string trước : 2301506
        str = str + str;
        // hashCode của String đã thay đổi, vì bây giờ là 1 chuỗi mới ở địa chỉ mới
        System.out.println("string sau: " + str.hashCode()); // string sau: -517387388

        StringBuffer stringBuffer = new StringBuffer("java");
        System.out.println("stringBuffer trước : " + stringBuffer.hashCode()); // stringBuffer trước : 1854731462
        stringBuffer = stringBuffer.append("java");
        // hashCode của StringBuffer không thay đổi
        System.out.println("stringBuffer sau : " + stringBuffer.hashCode()); // stringBuffer sau : 1854731462
    }
}
