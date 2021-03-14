package _27_Object_Class.Pack4_Equals_and_hashCode.Equals.OverridenEqualsInterface;

public class Student {
    private String id;
    private String name;
    private String email;
    private int age;

    public Student() {

    }

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String toString() {
        return "Student: " + this.id + " - " + this.name + " - " + this.email + " - " + this.age;
    }

    // ở đây equals() method chỉ so sánh thuộc tính id của 2 đối tượng thuộc kiểu Student
    // chúng ta sẽ coi mỗi đối tượng Student có 1 id duy nhất, nếu 2 đối tượng Student chỉ cần có id giống nhau
    // ta sẽ coi 2 đối tượng đó là bằng nhau
    public boolean equals(Object obj) {
        // tham số truyền vào là thể hiện của 1 lớp cụ thể, đối số obj có kiểu là Object, nên ở đây là upcasting
        // nếu obj là 1 thể hiện của class cần so sánh thì thực hiện downcasting, và lấy giá trị so sánh gián tiếp
        // qua obj
        if (obj instanceof Student) {
            Student student = (Student) obj; // downcasting
            if (this.id.equals(student.id)) {
                return true;
            } return false;
        }
        return false;
    }
}
