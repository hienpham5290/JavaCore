package _38_StringBuilder_Class;

public class Les4_Concat_Buffer_Builder {

    static void ConcatWithStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        for (int i = 0; i < 1000000; i++) {
            stringBuffer = stringBuffer.append("Hello");
        }
    }

    static void ConcatWithStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        for (int i = 0; i < 1000000; i++) {
            stringBuilder = stringBuilder.append("Hello");
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ConcatWithStringBuffer();
        long end = System.currentTimeMillis() - start;
        System.out.println("StringBuffer: " + end + " millisecond"); // StringBuffer: 31 millisecond

        long start1 = System.currentTimeMillis();
        ConcatWithStringBuilder();
        long end1 = System.currentTimeMillis() - start1;
        System.out.println("StringBuilder: " + end1 + " millisecond"); // StringBuilder: 16 millisecond
    }
}
