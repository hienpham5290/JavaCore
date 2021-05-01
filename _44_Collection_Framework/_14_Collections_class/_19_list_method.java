package _44_Collection_Framework._14_Collections_class;

/*
    sử dụng list(enumeration) để chuyển các phần tử của cấu trúc Enumeration sang
    cấu trúc List hoặc ArrayList
 */

import java.util.*;

public class _19_list_method {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.addElement(3);
        vector.addElement(4);
        System.out.println("vector's elements: " + vector);

        // khởi tạo đối tượng của Enumeration
        Enumeration<Integer> enumerationList = vector.elements();
        List<Integer> list = Collections.list(enumerationList);
        System.out.println("list's elements: " + list);

        // khởi tạo đối tượng của Enumeration
        Enumeration<Integer> enumerationArrayList = vector.elements();
        ArrayList<Integer> arrayList = Collections.list(enumerationArrayList);
        System.out.println("arrayList's elements: " + arrayList);
    }
}
