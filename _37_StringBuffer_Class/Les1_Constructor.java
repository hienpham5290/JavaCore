package _37_StringBuffer_Class;

public class Les1_Constructor {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer("Hello Java");
        StringBuffer stringBuffer2 = new StringBuffer(25);

        stringBuffer.append(stringBuffer1);
        System.out.println(stringBuffer);
        stringBuffer2.append(stringBuffer).append(" World !!!");
        System.out.println("_____________________________________");
        System.out.println(stringBuffer1);
        System.out.println(stringBuffer2);
    }
}
