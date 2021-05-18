package _44_Collection_Framework._18_removeDuplicate_InJava8;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String name;
    private String email;

    public Student(String name, String email) {
        super();
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + " - email=" + email + " ]";
    }
}

public class _03_collect_method {
    public static void main(String[] args) {
        List<Student> studentsWithDuplicate = new ArrayList<>();
        studentsWithDuplicate.add(new Student("Nguyen Nhat", "nguyennhat@gmail.com"));
        studentsWithDuplicate.add(new Student("Le Van", "levan@gmail.com"));
        studentsWithDuplicate.add(new Student("Tran Khoa", "trankhoa@gmail.com"));
        studentsWithDuplicate.add(new Student("Le Vo", "levan@gmail.com"));
        studentsWithDuplicate.add(new Student("Ly Nguyen", "lynguyen@gmail.com"));

        Set<Student> studentsWithoutDuplicate = studentsWithDuplicate
                .stream()
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Student::getEmail))));

        studentsWithoutDuplicate.forEach(s -> System.out.println(s));
    }
}
