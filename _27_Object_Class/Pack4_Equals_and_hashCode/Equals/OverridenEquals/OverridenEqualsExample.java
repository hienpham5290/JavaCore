package _27_Object_Class.Pack4_Equals_and_hashCode.Equals.OverridenEquals;

public class OverridenEqualsExample {
    public static void main(String[] args) {
        Student student1 = new Student("1", "Quang Hien", "quanghien@gmail.com", 23);
        Student student2 = new Student("1", "Quang Hien", "quanghien@gmail.com", 23);
        Student student3 = new Student("2", "Quang Hieu", "quanghieu@gmail.com", 29);

        System.out.println("student1 ==     student2 : " + (student1 == student2));
        System.out.println("student1 equals student2 : " + (student1.equals(student2)));
        System.out.println("student1 equals student3 : " + (student1.equals(student3)));
    }
}
