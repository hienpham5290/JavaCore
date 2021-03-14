package _27_Object_Class.Pack1_Reference_Copy;


/**
 * Như chúng ta đã biết, trong Java có 2 loại copy: Reference Copy (Copy tham chiếu) và Object Copy (Copy toàn bộ object).
 * _________________________________________________________________________________________________________________________
 * Reference Copy
 *
 * Đối với Reference Copy, khi chúng ta thay đổi một thuộc tính của một đối tượng thì thuộc tính của đối tượng copy cũng bị thay đổi theo.
 * Cách này chúng ta thường gặp khi copy đối tượng thông qua toán tử bằng (=).
 * Khi ta khởi tạo 1 đối tượng, JVM sẽ cung cấp 1 vùng nhớ chứa dữ liệu cho biến đối tượng đó tham chiếu đến
 * Nếu ta khởi tạo 1 đối tượng thứ 2 bằng cách tham chiếu đến biến đối tượng thứ nhất
 * Lúc này cả 2 biến đối tượng đều tham chiếu đến cùng 1 địa chỉ vùng nhớ, cùng có thể thay đổi các giá trị trong vùng nhớ đó
 * Khi đó, bất kỳ biến đối tượng nào thay đổi bất kỳ giá trị nào trong vùng nhớ, thì giá trị đó cũng được tham chiếu cho biến đối tượng còn lại
 *
 */

public class ReferenceCopy {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Hien");
        Student student2 = student1;
        student1.Show();
        student2.Show();
        System.out.println();

        System.out.println("[ kiểm tra 2 object có cùng địa chỉ tham chiếu hay không ]");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println();

        System.out.println("[ thay đổi giá trị id của student1 ]");
        student1.id = 888;
        student2.name = "Jack";
        student1.Show();
        student2.Show();
    }
}

class Student {
    int     id;
    String  name;

    Student() {

    }

    Student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public void Show() {
        System.out.println(
                "Student [id= " + this.id +
                        ", name= " + this.name + " ]"
        );
    }
}

