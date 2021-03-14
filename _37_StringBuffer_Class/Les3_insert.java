package _37_StringBuffer_Class;

public class Les3_insert {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Nice to meet you");
        StringBuffer s1 = new StringBuffer("Hello Java World !!!");

        sb1.insert(5, s1);
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = new StringBuffer("Hello");

        System.out.println(sb2);
        sb2.insert(0, sb3);
        System.out.println(sb2);
    }
}
