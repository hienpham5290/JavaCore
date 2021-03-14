package _38_StringBuilder_Class;

public class Student2 {
    int rollno;
    String name;
    String city;

    Student2(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    // Ghi đè phương thức toString()
    public String toString() {
        return rollno + " " + name + " " + city;
    }

    public static void main(String args[]) {
        Student2 s1 = new Student2(101, "Viet", "HaNoi");
        Student2 s2 = new Student2(102, "Nam", "DaNang");

        // trình biên dịch sẽ ghi s1.toString() thay vì s1
        // có nghĩa là khi khai báo s1 thì phương thức s1.toString()
        // được gọi
        System.out.println(s1); // 101 Viet HaNoi
        // trình biên dịch sẽ ghi s2.toString() thay vì s2
        System.out.println(s2); // 102 Nam DaNang
    }
}
