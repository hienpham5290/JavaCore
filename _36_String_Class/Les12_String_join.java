package _36_String_Class;

public class Les12_String_join {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "!";
        String s4 = "Welcome";
        String s5 = "to";

//        String joinString = String.join("_____", s1, s3, s4, s5, s2);
        String joinString = String.join("-", s1, s3, s4, s5, s2);
        System.out.println(joinString);
    }
}
