package _37_StringBuffer_Class;

public class Les9_charAt {
    public static void main(String[] args) {
        StringBuffer stringBuffer1 = new StringBuffer("Hello Java, Hello Android, Hello World");

        System.out.println("length : " + stringBuffer1.length()); // length : 38
        System.out.println("capacity : " + stringBuffer1.capacity()); // capacity : 54

        try {
            System.out.println("charAt(0) : " + stringBuffer1.charAt(0)); // charAt(0) : H
            System.out.println("charAt(37) : " + stringBuffer1.charAt(37)); // charAt(37) : d
//            System.out.println("charAt(38) : " + stringBuffer1.charAt(38)); // Index out of bound exception
            System.out.println("charAt(-2) : " + stringBuffer1.charAt(-2)); // Index out of bound exception
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bound exception"); // Index out of bound exception
        }

    }
}
