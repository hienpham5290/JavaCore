package _44_Collection_Framework._14_Collections_class;

/*
    sử dụng
    - Collections.addAll(Collection<? super T> c, T… elements)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _02_addAll_method {
    public static void main(String[] args) {
        /*
        khởi tạo ArrayList, add element với cách thông thường
        show value của ArrayList
         */
        List<String> list = new ArrayList<>();
        list.add("C");
        list.add("Java Core");
        list.add("Java Advance");
        System.out.println("list: " + list); // list: [C, Java Core, Java Advance]

        /*
        sử dụng Collections.addAll(Collection<? super T> collection, T... elements)
        thêm các phần tử vào list
        show value của ArrayList sau khi dùng phương thức của Collections class
         */
        Collections.addAll(list, "Servlet", "JSP");
        System.out.println("list: " + list); // list: [C, Java Core, Java Advance, Servlet, JSP]

        /*
        khởi tạo 1 mảng String
        sử dụng Collections.add(Collection<? super T> collection, T... elements)
        thêm mảng String vào list
        show value của ArrayList sau khi dùng phương thức của Collections class
         */
        String[] strArr = {"C#", ".Net"};
        Collections.addAll(list, strArr);
        System.out.println("list: " + list); // list: [C, Java Core, Java Advance, Servlet, JSP, C#, .Net]
    }
}
