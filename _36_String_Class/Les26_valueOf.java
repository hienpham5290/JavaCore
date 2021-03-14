package _36_String_Class;

public class Les26_valueOf {
    public static void main(String[] args) {
        byte byt = 78;
        boolean boo = false;
        char cha = 'N';
        int i = 150;
        long l = 2000L;
        float f = 4.2222F;
        double d = 4.2121121;

        System.out.println("java".concat(String.valueOf(byt)));
        System.out.println("java".concat(String.valueOf(boo)));
        System.out.println("java".concat(String.valueOf(cha)));
        System.out.println("java".concat(String.valueOf(i)));
        System.out.println("java".concat(String.valueOf(l)));
        System.out.println("java".concat(String.valueOf(f)));
        System.out.println("java".concat(String.valueOf(d)));
    }
}
