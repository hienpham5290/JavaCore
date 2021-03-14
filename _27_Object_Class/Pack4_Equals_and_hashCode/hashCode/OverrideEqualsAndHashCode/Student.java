package _27_Object_Class.Pack4_Equals_and_hashCode.hashCode.OverrideEqualsAndHashCode;

public class Student {
    private String id;
    private String name;
    private String email;
    private int age;

    public Student(){}

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
        return "Student: " + this.id + ", " + this.name + ", " + this.email + ", " + this.age;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            return this.id.equals(student.id);
        } else return false;
    }

    public int hashCode() {
        return this.id.hashCode();
    }
}
