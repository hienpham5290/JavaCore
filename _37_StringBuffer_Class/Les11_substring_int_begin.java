package _37_StringBuffer_Class;

public class Les11_substring_int_begin {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello Java, Hello Android");
        System.out.println(stringBuffer); // Hello Java, Hello Android

        try {
            String s = stringBuffer.substring(10);
            System.out.println(s); // , Hello Android
            String s1 = stringBuffer.substring(55); // exception xảy ra ở đây, nhảy vào catch
            System.out.println(s1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index Out Of Bounds Exception"); // Index Out Of Bounds Exception
        }

    }
}
