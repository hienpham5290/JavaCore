package _36_String_Class;

public class Les4_join_string {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = " Java ";
        String s3 = "!";

//        String s4 = s1 + s2 + s3;
//        System.out.println(s4);

        String s5 = "Hello" + " Java " + "!";
        System.out.println(s5);



        String s4 = (new StringBuilder()).append(s1).append(s2).append(s3).toString();
        System.out.println(s4);

        int i1 = 50;
        int i2 = 100;
        int i3 = 2;
        String t = " times for ";
        String e = " = ";

        String s6 = i3 + " times for " + i1 + " = " + i2;
        String s7 = 2 + t + 50 + e + 100;
        System.out.println(s6);
        System.out.println(s7);


        // DÙNG METHOD CONCAT()
        String s8 = s1.concat(s2).concat(s3);
        System.out.println(s8);


    }
}
