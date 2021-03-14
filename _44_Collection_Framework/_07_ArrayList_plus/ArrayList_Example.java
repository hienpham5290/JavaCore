package _44_Collection_Framework._07_ArrayList_plus;

/*
    ta khởi tạo 1 ArrayList với sức chứa (capacity) ban đầu là 5 phần tử
    khi ta thêm phần tử thứ 6, kích thước của nó vượt quá sức chứa của ArrayList
    dẫn đến ArrayList sẽ tự tăng kích thước thêm 50% so với sức chứa hiện có
    5 + 5(5*50%) = 7
 */

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayList_Example {
    public static void main(String[] args) throws Exception{
        ArrayList<String> list = new ArrayList<>(5);
        list.add("item0");
        list.add("item1");
        list.add("item2");
        list.add("item3");
        list.add("item4");
        System.out.printf("size = %d, capacity = %d", list.size(), getCapacity(list));
        list.add("item5");
        System.out.println();
        System.out.printf("size = %d, capacity = %d", list.size(), getCapacity(list));

    }

    public static int getCapacity(ArrayList<?> list) throws Exception{
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(list)).length;
    }
}
