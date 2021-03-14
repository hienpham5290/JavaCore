package _43_Java_Generics.Generic_Class._4;

public class Main {
    public static void main(String[] args) {
        // khai báo Mã nhân viên, tên nhân viên
        LongAndValueEntry<String> longAndValueEntry = new LongAndValueEntry<String>(1234567890L, "Tom");
        Long empNumber = longAndValueEntry.getKey();
        String empName = longAndValueEntry.getValue();

        System.out.println("Emp Number: " + longAndValueEntry.getKey());
        System.out.println("Emp Name: " + longAndValueEntry.getValue());
    }
}
