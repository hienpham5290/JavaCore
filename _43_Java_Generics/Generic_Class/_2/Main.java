package _43_Java_Generics.Generic_Class._2;

public class Main {
    public static void main(String[] args) {
        Test<String> object1 = new Test<>("1234");
        System.out.println(object1.getObject());

        Test<Integer> object2 = new Test<>(1234);
        System.out.println(object2.getObject());

        // compiler báo lỗi ngay lập tức, vì 2 object này khác Generic Type
//        System.out.println(object2 == object1);
    }
}
