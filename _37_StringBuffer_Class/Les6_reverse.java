package _37_StringBuffer_Class;

public class Les6_reverse {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World, Hello Java, Hello Android");
        System.out.println(sb); // Hello World, Hello Java, Hello Android

        sb.reverse();
        System.out.println(sb); // diordnA olleH ,avaJ olleH ,dlroW olleH
    }
}
