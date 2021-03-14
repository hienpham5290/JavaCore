package _36_String_Class;

public class Les18_indexOf {
    public static void main(String[] args) {
        String s = "zhajdioanqhduoejnaslkdjfinsadfkasl";
        char c = 'k';
        System.out.println(s.indexOf(c)); // 20
        System.out.println(s.indexOf(c, 21)); // 30

        String s1 = "uo";
        System.out.println(s.indexOf(s1)); // 12
        System.out.println(s.indexOf(s1, 13)); // -1
    }
}
