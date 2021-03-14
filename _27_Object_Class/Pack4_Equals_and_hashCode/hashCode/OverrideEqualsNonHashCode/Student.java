package _27_Object_Class.Pack4_Equals_and_hashCode.hashCode.OverrideEqualsNonHashCode;

public class Student {
    private final String id;
    private String name;
    private String email;
    private int age;

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

    public boolean equals(Object object) {
        if (object instanceof Student) {
            Student student = (Student) object;
            if (this.id.equals(student.id)) {
                return true;
            } else return false;
        }
        return false;
    }
}
