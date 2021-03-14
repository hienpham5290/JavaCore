package _36_String_Class;

public class Les25_isEmpty {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "Java";
        String s3 = null;

        try {
            System.out.println(s1.isEmpty());
            System.out.println(s2.isEmpty());
            System.out.println(s3.isEmpty());
        } catch (NullPointerException exception) {
            System.out.println(exception.toString());
        }

    }
}
