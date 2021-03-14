package _38_StringBuilder_Class;

public class Les2_ConcatTest {

    static void ConcatWithString() {
        String s = "Hello Java";
        for (int i = 0; i < 10000; i++) {
            s = s + "Hello Java";
        }
    }

    static void ConcatWithStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer("Hello Java");
        for (int i = 0; i < 10000; i++) {
            stringBuffer = stringBuffer.append("Hello Java");
        }
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ConcatWithString();
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("Thời gian thực hiện nối chuỗi String: " + endTime + " millisecond"); // 118 milli giây

        startTime = System.currentTimeMillis();
        ConcatWithStringBuffer();
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Thời gian thực hiện nối chuỗi StringBuffer: " + endTime+ " millisecond"); // 1 milli giây
    }
}
