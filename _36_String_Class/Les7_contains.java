package _36_String_Class;

public class Les7_contains {
    public static void main(String[] args) {
        String s = "Java, Kotlin, Dart, Android, Flutter";
        String s1 = "Hello";
        System.out.println(s.contains(s1)); // false
        System.out.println(s.contains("Kotlin")); // true
    }
}
