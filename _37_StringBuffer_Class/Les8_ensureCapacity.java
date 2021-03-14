package _37_StringBuffer_Class;

public class Les8_ensureCapacity {
    public static void main(String[] args) {
        StringBuffer stringBuffer1 = new StringBuffer();
        int oldCapacity1 = stringBuffer1.capacity();
        System.out.println("stringBuffer1 - old capacity : " + oldCapacity1); // stringBuffer1 - old capacity : 16

        stringBuffer1.ensureCapacity(50);
        int newCapacity1 = stringBuffer1.capacity();
        System.out.println("stringBuffer1 - new capacity : " + newCapacity1); // stringBuffer1 - new capacity : 50

        StringBuffer stringBuffer2 = new StringBuffer(20);
        int oldCapacity2 = stringBuffer2.capacity();
        System.out.println("stringBuffer2 - old capacity : " + oldCapacity2); // stringBuffer2 - old capacity : 20

        stringBuffer2.ensureCapacity(19);
        int newCapacity2 = stringBuffer2.capacity();
        System.out.println("stringBuffer2 - new capacity : " + newCapacity2); // stringBuffer2 - new capacity : 20
    }
}
