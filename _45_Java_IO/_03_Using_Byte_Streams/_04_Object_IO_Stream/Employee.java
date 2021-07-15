package _45_Java_IO._03_Using_Byte_Streams._04_Object_IO_Stream;

import java.io.Serializable;

/**
 * class Employee implements Serializable để có thể
 * thực hiện cơ chế Serialization
 * nhằm mục đích thực hiện việc ghi và đọc đối tượng
 * vào trong stream
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = 1l;

    private String fullName;
    private float salary;

    public Employee(String fullName, float salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
