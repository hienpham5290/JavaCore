package _43_Java_Generics.Generic_Wildcard._2_wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Hien", 31, "Ca Mau"));
        studentsList.add(new Student("Hieu", 27, "Ca Mau"));
        studentsList.add(new Student("Tien", 26, "Ca Mau"));
        findMaxAge(studentsList);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher("Trung", 40, "Nam Dinh"));
        teacherList.add(new Teacher("Nam", 41, "Ha Nam"));
        teacherList.add(new Teacher("Trung", 40, "Binh Dinh"));
        findMaxAge(teacherList);
    }

    // wildcard upper bounded - giới hạn Person trở xuống, nhận các kiểu từ Person
    // và các kiểu con của Person
    private static void findMaxAge(List<? extends Person> list) {
        Person findObj = null;
        for (Person person : list) {
            if ((findObj == null) || (findObj.age < person.age)) {
                findObj = person;
            }
        }
        if (findObj != null) {
            showInfo(findObj);
        }
    }

    private static void showInfo(Person findObj) {
        System.out.printf("%s, %d year old, from %s - ", findObj.name, findObj.age, findObj.address);
        findObj.say();
    }
}
