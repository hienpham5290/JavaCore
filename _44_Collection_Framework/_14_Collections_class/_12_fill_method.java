package _44_Collection_Framework._14_Collections_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Sử dụng phương thức
    - Collections.fill(List<? super T> list, T obj)
    để thay thế tất cả các phần tử trong list bởi phần tử chỉ định
 */
public class _12_fill_method {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        System.out.println("integerList before fill: " + integerList);

        // fill
        Collections.fill(integerList, 0);
        System.out.println("integerList after fill: " + integerList);

        List<String> stringList = new ArrayList<>();
        stringList.add("BasicJava");
        stringList.add("OOP");
        stringList.add("JavaCore");
        stringList.add("Android");
        System.out.println("stringList before fill: " + stringList);

        // fill
        Collections.fill(stringList, null);
        System.out.println("stringList after fill: " + stringList);
    }
}
