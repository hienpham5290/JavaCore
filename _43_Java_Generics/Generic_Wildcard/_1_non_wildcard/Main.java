package _43_Java_Generics.Generic_Wildcard._1_non_wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Student("Name", 21, "Thai Nguyen"));
        list.add(new Teacher("Trung", 40, "Ha Noi"));
        findMaxAge(list);
    }

    // không dùng Wildcard
    public static void findMaxAge(List<Person> list) {
        // khai báo 1 object Person chưa xác định
        Person maxAgeObject = null;

        // dùng foreach chạy qua list, tìm object có age là maximum
        for (Person person : list) {
            // nếu maxAgeObject là null hoặc age của maxAgeObject < age của person
            // thì thay thế maxAgeObject bằng instance của person
            if ((maxAgeObject == null) || (maxAgeObject.age < person.age)) {
                maxAgeObject = person;
            }
        }

        // sau khi chạy hết foreach, maxAgeObject khác null, thực hiện showInfo
        if (maxAgeObject != null) {
            showInfo(maxAgeObject);
        }
    }

    public static void showInfo(Person person) {
        System.out.printf("%s , %d year old, from %s%n", person.name, person.age, person.address);
        person.say();
    }
}
