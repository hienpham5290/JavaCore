package _36_String_Class;

public class Les13_trim {
    public static void main(String[] args) {
        String s1 = "Start";
        String s2 = "       Hello       Java       ";
        String s3 = "End";

        System.out.println(s1 + s2 + s3);
        System.out.println(s1 + s2.trim() + s3);
    }
}
