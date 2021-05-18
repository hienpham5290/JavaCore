package _43_Java_Generic._03_Interface_Generic;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Student", 99);
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.insert(student);

        Teacher teacher = new Teacher("Teacher", 100);
        TeacherDAO teacherDAO = new TeacherDAO();
        teacherDAO.update(teacher);
    }
}
