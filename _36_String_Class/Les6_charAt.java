package _36_String_Class;

public class Les6_charAt {
    public static void main(String[] args) {
        String s = "Java, Kotlin, SQL, Android";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(i + " : " + s.charAt(i));
        }
    }
}
