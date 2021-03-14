package _37_StringBuffer_Class;

public class Les10_length {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("kkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        System.out.println("capacity: " + stringBuffer.capacity()); // capacity: 45
        System.out.println("length: " + stringBuffer.length()); // length: 29
    }
}
