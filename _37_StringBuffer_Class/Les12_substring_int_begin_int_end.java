package _37_StringBuffer_Class;

public class Les12_substring_int_begin_int_end {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello World, Hello Java, Hello Android");
        System.out.println(stringBuffer); // Hello World, Hello Java, Hello Android
        System.out.println(stringBuffer.length()); // 38

        try {
            System.out.println(stringBuffer.substring(10, 37)); // d, Hello Java, Hello Androi
            System.out.println(stringBuffer.substring(10, 38)); // endIndex out of bounds string
            System.out.println(stringBuffer.substring(38, 50)); // beginIndex out of bounds string
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index Out Of Bounds Exception");
        }

    }
}
