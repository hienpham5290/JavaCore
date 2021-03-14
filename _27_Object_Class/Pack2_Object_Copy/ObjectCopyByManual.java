package _27_Object_Class.Pack2_Object_Copy;

/**
 * Lớp Object trong Java
 *
 * mặc định lớp Object là superclass của tất cả các lớp trong Java ( là lớp cao nhất trong Java )
 *
 * nghĩa là khi 1 lớp được tạo ra, nó mặc định kế thừa lớp Object, nó chỉ dừng kế thừa lớp Object
 * khi nó kế thừa 1 lớp nào đó khác, khi đó lớp mà nó kế thừa sẽ kế thừa lớp Object
 *
 * tóm lại: Object luôn là lớp cao nhất, là lớp cha của tất cả các lớp trong Java
 *
 * vì là superclass cao nhất, nên những phương thức của lớp Object, các lớp khác trong Java đều
 * sử dụng được ( bằng cách override )
 *
 * CÁC PHƯƠNG THỨC CỦA CLASS OBJECT
 *
 * - clone()
 *
 *
 *
 *
 *
 *
 *
 *
 * _________________________________________________________________________________________________________________________
 *
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
 * _________________________________________________________________________________________________________________________
 * Object Copy - Object cloning
 *
 * có 2 cách sử dụng để đạt được object cloning
 *      - thủ công: khởi tạo 1 biến đối tượng thứ nhất, chứa đầy đủ các giá trị thuộc tính
 *                  sau đó khởi tạo 1 đối tượng thứ 2 với các thuộc tính chứa giá trị mặc định,
 *                  rồi gán từng thuộc tính của đối tượng thứ nhất cho từng thuộc tính của đối tượng thứ 2
 *                  với cách này, khi 1 đối tượng có rất nhiều thuộc tính, việc gán từng thuộc tính sẽ rất mệt mỏi
 *                  vì vậy, lớp Object cung cấp 1 phương thức có thể tự động làm điều đó, chính là clone() method
 *      - method cloning:
 *
 *
 *
 */

public class ObjectCopyByManual {
    public static void main(String[] args) {
        Student student1 = new Student(111, "Hien");
        Student student2 = new Student();
        // với những đối tượng có nhiều thuộc tính, việc gán từng thuộc tính như dưới đây sẽ rất dễ xảy ra lỗi, cồng kềnh
        student2.id     = student1.id;
        student2.name   = student1.name;
        System.out.println("[ kiểm tra 2 object có cùng địa chỉ tham chiếu hay không ]");
        System.out.println("student1 : " + student1);
        System.out.println("student2 : " + student2);
        System.out.println();

        student1.Show();
        student2.Show();
        System.out.println();

        System.out.println("Thay đổi giá trị ở bất kỳ thuộc tính của bất kỳ 2 đối tượng đã sao chép");
        student1.id = 999;
        student2.name = "Jack";
        student1.Show();
        student2.Show();
    }
}

class Student {
    int     id;
    String  name;

    public Student(){

    }

    public Student(int id, String name) {
        this.id     = id;
        this.name   = name;
    }

    public void Show() {
        System.out.println(
                "Student [id= " + this.id +
                        ", name= " + this.name + " ]"
        );
    }
}
