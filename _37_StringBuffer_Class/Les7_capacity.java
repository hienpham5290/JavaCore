package _37_StringBuffer_Class;

public class Les7_capacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World, Hello Java, Hello Android");
        System.out.println(sb); // Hello World, Hello Java, Hello Android

        int sbCapacity = sb.capacity(); // Hello World, Hello Java, Hello Android
        System.out.println(sb.length()); // 38
        System.out.println(sbCapacity); // 54

        System.out.println();

        StringBuffer sb1 = new StringBuffer("HelloWorld");
        System.out.println(sb1); // HelloWorld
        System.out.println(sb1.length()); // 10
        System.out.println(sb1.capacity()); // 26

        System.out.println();

        sb1.append("HelloWorld"); // giống đệ quy chả hiểu ^^!, nối 3 lần, tăng lên 80 ký tự
        System.out.println(sb1);
        System.out.println(sb1.length()); // 80
        System.out.println(sb1.capacity()); // 110

        System.out.println();

        sb1.append("HelloWorld");
        System.out.println(sb1);
        System.out.println(sb1.length()); // 80
        System.out.println(sb1.capacity()); // 110

        System.out.println();

        sb1.append("HelloWorld");
        System.out.println(sb1);
        System.out.println(sb1.length()); // 80
        System.out.println(sb1.capacity()); // 110

        System.out.println();

        sb1.append("HelloWorld");
        System.out.println(sb1);
        System.out.println(sb1.length()); // 80
        System.out.println(sb1.capacity()); // 110

        System.out.println();

        sb1.append("HelloWorld");
        System.out.println(sb1);
        System.out.println(sb1.length()); // 80
        System.out.println(sb1.capacity()); // 110

        System.out.println();

        sb1.append("HelloWorld");
        System.out.println(sb1);
        System.out.println(sb1.length()); // 80
        System.out.println(sb1.capacity()); // 110

        System.out.println();

        sb1.append("HelloWorld");
        System.out.println(sb1);
        System.out.println(sb1.length()); // 80
        System.out.println(sb1.capacity()); // 110

        System.out.println();

        sb1.append("HelloWorld");
        System.out.println(sb1);
        System.out.println(sb1.length()); // 80
        System.out.println(sb1.capacity()); // 110

        System.out.println();

        sb1.append("HelloWorld");
        System.out.println(sb1);
        System.out.println(sb1.length()); // 80
        System.out.println(sb1.capacity()); // 110
    }
}
