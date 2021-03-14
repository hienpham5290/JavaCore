package _43_Java_Generics.Generic_Class._3;

public class Main {
    public static void main(String[] args) {
        PhoneNameEntry phoneNameEntry = new PhoneNameEntry(123456, "Tom");

        // Java hiểu kiểu trả về là Integer
        Integer phone = phoneNameEntry.getKey();

        // Java hiểu kiểu trả về là String
        String name = phoneNameEntry.getValue();

        System.out.println("Phone: " + phone + "\n" + "Name: " + name);
    }
}
