package _36_String_Class;

public class Les9_startWith_prefix_index {
    public static void main(String[] args) {
        String s = "Java, Kotlin, Dart, SQL, Android, Flutter";

        String s1 = "SQL";

        System.out.println(s.startsWith(s1, 3));
        System.out.println(s.startsWith("SQL", 20));
    }
}
