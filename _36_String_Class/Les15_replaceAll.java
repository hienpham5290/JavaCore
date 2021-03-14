package _36_String_Class;

public class Les15_replaceAll {
    public static void main(String[] args) {
        String s = "My name is Khan. My name is Bob. My name is Sonoo.";
        System.out.println(s);

        s = s.replaceAll("\\s+i", "----");
        System.out.println(s);
    }
}
