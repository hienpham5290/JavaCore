package _36_String_Class;

public class Les10_endsWith {
    public static void main(String[] args) {
        String s = "Java, Kotlin, SQL, Android, Flutter";

        String s1 = "er";

        System.out.println(s.endsWith(s1)); // true
        System.out.println(s.endsWith("Flutter")); // true
    }
}
