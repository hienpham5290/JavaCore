package _1_Class_Object;

public class Student3 {
    int     id;
    String  name;

    public Student3() {
    }

    public Student3(int id, String name) {
        this.id     =   id;
        this.name   =   name;
    }

    void showInfo(){
        System.out.println(this.id + " - " + this.name);
    }

    public static void main(String[] args) {
        Student3 student3 = new Student3(23, "Quang Hien");
        Student3 student31 = new Student3(22, "Quang Khai");

        student3.showInfo();
        student31.showInfo();
    }
}
