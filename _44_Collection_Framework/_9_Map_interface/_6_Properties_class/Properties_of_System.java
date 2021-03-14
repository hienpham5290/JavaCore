package _44_Collection_Framework._9_Map_interface._6_Properties_class;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Properties_of_System {
    public static void main(String[] args) {
        // init Properties' object contain System's data
        Properties properties = System.getProperties();

        // transfer data of Properties' object into a Set's object
        Set<Map.Entry<Object, Object>> entrySet = properties.entrySet();

        // get Iterator's object base Set's object, to retrive through Set's object
        Iterator<Map.Entry<Object, Object>> iterator = entrySet.iterator();

        // show System's properties
        while (iterator.hasNext()) {
            // get Map.Entry's object from Iterator's object
            Map.Entry<Object, Object> entry = iterator.next();

            // init a key object to contain data
            Object key = entry.getKey();
            // init a value object to contain data
            Object value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
