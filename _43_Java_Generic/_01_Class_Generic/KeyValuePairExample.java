package _43_Java_Generic._01_Class_Generic;

public class KeyValuePairExample {
    public static void main(String[] args) {
        KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>("Java", 8);
        String name = keyValuePair.getKey();
        Integer version = keyValuePair.getValue();
        System.out.println("name=" + name + ", version=" + version);
    }
}
