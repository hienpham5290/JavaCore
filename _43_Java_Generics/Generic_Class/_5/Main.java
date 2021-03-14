package _43_Java_Generics.Generic_Class._5;

public class Main {
    public static void main(String[] args) {
        KeyStringInfo<Long, Integer> keyStringInfo = new KeyStringInfo<Long, Integer>(1234567890L, "Tom", 31);

        Long idCode = keyStringInfo.getKey();
        String name = keyStringInfo.getValue();
        Integer age = keyStringInfo.getInfo();

        System.out.println("ID: " + idCode);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
