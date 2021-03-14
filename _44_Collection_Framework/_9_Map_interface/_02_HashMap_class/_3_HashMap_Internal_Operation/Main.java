package _44_Collection_Framework._09_Map_interface._2_HashMap_class._3_HashMap_Internal_Operation;

import java.util.HashMap;
import java.util.Map;

class Key {
    String key;

    public Key(String key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        int hash = (int) key.charAt(0);
        System.out.println("hashCode() is called, for key: " + this.key + "=" + hash);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals() is called");
        return this.key.equals(((Key) obj).key);
    }
}

public class Main {
    public static void main(String[] args) {
        Map<Key, Integer> hashMap = new HashMap<>();
        Key key1 = new Key("vinhrau");
        Key key2 = new Key("sontungmtp");
        Key key3 = new Key("vinhhoa");

        hashMap.put(key1, 20);
        hashMap.put(key2, 30);
        hashMap.put(key3, 40);

        System.out.println();
        System.out.println("Value of key: vinhrau " + hashMap.get(key1));
        System.out.println("Value of key: sontungmtp " + hashMap.get(key2));
        System.out.println("Value of key: vinhhoa " + hashMap.get(key3));
    }
}
