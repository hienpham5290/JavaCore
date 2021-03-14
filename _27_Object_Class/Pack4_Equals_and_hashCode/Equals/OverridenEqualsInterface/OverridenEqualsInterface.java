package _27_Object_Class.Pack4_Equals_and_hashCode.Equals.OverridenEqualsInterface;

import java.util.ArrayList;
import java.util.List;

public class OverridenEqualsInterface {
    public static void main(String[] args) {
        // khởi tạo 3 đối tượng thuộc Student class
        Student student1 = new Student("12", "Quang Hien", "quanghien@gmail.com", 31);
        Student student2 = new Student("13", "Quang Hieu", "quanghieu@gmail.com", 27);
        Student student3 = new Student("14", "Quang Tien", "quangtien@gmail.com", 26);
        Student student6 = new Student();

        // Dùng List-ArrayList tạo danh sách các object của Student class
        List<Student> studentList = new ArrayList<>();

        // add từng đối tượng vào trong danh sách
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student6);

        System.out.println(student1.equals(student6));

        // in ra thông tin từng đối tượng
        for (Student student : studentList) {
            System.out.println(student);
        }

        // Khởi tạo 2 đối tượng thuộc Student class chỉ có giá trị id
        Student student4 = new Student("14");
        Student student5 = new Student("16");

        // Tìm kiếm trong danh sách có contains student4, student5 hay không
        // contains() method trong interface List return giá trị boolean,
        // về bản chất equals() method được gọi trong contains() method
        // nếu trong class chứa đối tượng cần so sánh không ghi đè equals() method
        // contains() method sẽ gọi mặc định equals() của Object class
        System.out.println("Search student4 in studentList: " + studentList.contains(student4));
        System.out.println("Search student5 in studentList: " + studentList.contains(student5));

    }
}
