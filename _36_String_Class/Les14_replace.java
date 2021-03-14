package _36_String_Class;

public class Les14_replace {
    public static void main(String[] args) {
        String s = "Hello everybody on the world !!!!, I am Developer";

        s = s.replace(' ', '-');
        System.out.println(s);

        s = s.replace("o", "Moo");
        System.out.println(s);
    }
}
