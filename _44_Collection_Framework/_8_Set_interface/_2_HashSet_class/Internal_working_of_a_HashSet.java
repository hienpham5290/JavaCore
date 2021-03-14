package _44_Collection_Framework._8_Set_interface._2_HashSet_class;

import java.util.HashSet;

public class Internal_working_of_a_HashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        /*
            khi add phần tử vào HashSet bằng add() method của HashSet
            bên trong nó sẽ gọi put() method của HashMap
            giá trị truyền vào cho put() method là:
                key = (giá trị phần tử cần truyền vào cho HashSet)
                value = (đối tượng giả có giá trị null)

                    public boolean add("RED") {
                        return map.put("RED", PRESENT)==null;
                    }
         */
        hs.add("RED");
        hs.add("GREEN");
        hs.add("BLUE");
        hs.add("PINK");

        /*
            khi remove phần tử khỏi HashSet bằng remove() method của HashSet
            bên trong nó sẽ gọi remove() method của HashMap
            giá trị truyền vào cho remove() method của HashMap là:
                key = (giá trị phần tử cần loại bỏ khỏi HashSet)

                public boolean remove("RED") {
                    return map.remove("RED")==PRESENT;
                }
         */
        hs.remove("RED");
    }
}