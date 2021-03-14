package _36_String_Class;

public class Les11_String_format {
    public static void main(String[] args) {
        String header = String.format("%-12s%-12s%s","Column 1","Column 2","Column3");
        String row = String.format("%-12d%-12d%07d", 15, 12, 5);
        System.out.println(header);
        System.out.println(row);
    }
}
