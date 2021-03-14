package _36_String_Class;

public class Les19_lastIndexOf {
    public static void main(String[] args) {
        String s = "this is index of example";

        int index1 = s.lastIndexOf('s');
        int index2 = s.lastIndexOf('s', 12);
        int index3 = s.lastIndexOf("ex");
        int index4 = s.lastIndexOf("ex", 22);

        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);
    }
}
