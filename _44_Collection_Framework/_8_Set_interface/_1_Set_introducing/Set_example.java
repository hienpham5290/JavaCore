package _44_Collection_Framework._8_Set_interface._1_Set_introducing;

import java.util.HashSet;
import java.util.Set;

public class Set_example {
    public static void main(String[] args) {
        // create Set
        Set<String> set = new HashSet<>();

        // add element into Set
        set.add("A02");
        set.add("D03");
        set.add("D03");
        set.add("01");
        set.add("02");

        // retrive Set through for-each
        for (String e :
                set) {
            System.out.print(e + ", ");
        }

        // ở trên ta sử dụng HashSet, nên thứ tự các phần tử
        // không theo thứ tự được thêm vào
        // nếu muốn thứ tự các phần tử theo đúng trình tự được thêm vào
        // ta sử dụng LinkedHashSet
        // hoặc có thể sử dụng TreeSet để các phần tử thêm vào được sắp xếp
        // và do đặc điểm của Set interface không chứa các phần tử
        // giống nhau, nên khi xuất ra chỉ có 1 phần tử là D03
    }
}
