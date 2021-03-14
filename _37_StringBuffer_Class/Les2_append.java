package _37_StringBuffer_Class;

public class Les2_append {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Java";
        StringBuffer sb2 = new StringBuffer("!!!");

        StringBuffer sb1 = new StringBuffer(s1);
        sb1.append(s2).append(sb2);
        System.out.println(sb1);
    }
}
