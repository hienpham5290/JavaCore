package _27_Object_Class.Pack3_ObjectCopyByClone.ShallowCloning;

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
 *
 *      - method cloning: có 2 cách áp dụng method clone()
 *          - Shallow Cloning
 *          - Deep Cloning
 *
 * thay vì cloning thủ công bằng cách khởi tạo đối tượng bằng toán tử new
 * ta có thể dùng method clone() để tạo một đối tượng mới ở 1 địa chỉ khác trong memory và có các giá trị thuộc tính giống với đối tượng gốc
 *
 * lớp chứa đối tượng cần cloning phải implements Cloneable ( Cloneable là interface )
 * với Deep Cloning ta còn implements Cloneable cho các lớp liên quan
 *
 * sau khi implements Cloneable, ta cần phải override lại method clone() của superclass Object ở class cần thực hiện cloning
 *
 *
 * method clone override ở class cần cloning có dạng
 *
 *                      public Class-trả-về clone() throws CloneNotSupportException {
 *                          return (Class-trả-về) super.clone();
 *                      }
 *
 * _________________________________________________________________________________________________________________________
 * Shallow Cloning ( mặc định của cloning là Shallow Cloning )
 *
 * trong Shallow Cloning, các thuộc tính của original object có kiểu là primitive sẽ được sao chép sang địa chỉ khác để copied object reference đến
 * riêng các thuộc tính có kiểu class, vẫn sẽ dùng địa chỉ cũ trong memory để cho copied object reference đến
 * vì vậy trong Shallow Cloning, sau khi copied object được tạo ra, ngoại trừ các thuộc tính có kiểu dữ liệu là primitive
 * thì với các thuộc tính có kiểu là class, nếu ta thay đổi giá trị bất kỳ thuộc tính nào của thuộc tính có kiểu class trong original object
 * sẽ dẫn đến các giá trị tương ứng trong copied object cũng thay đổi theo
 *
 * điều này đôi khi dẫn đến một số tình huống không mong muốn
 *
 *
 *
 * _________________________________________________________________________________________________________________________
 * Deep Cloning ( implements Cloneable ở tất cả các class liên quan đến original class )
 *
 */

class Person implements Cloneable {
    int     id;
    String  name;
    Address  address;

    public Person(int id, String name, Address address) {
        this.id         = id;
        this.name       = name;
        this.address    = address;
    }

    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    public String toString() {
        return "Person [ id = " + this.id + ", name = " + this.name + ", Address " + this.address + " ]";
    }
}

class Address {
    String  district;
    String  province;

    public Address(String district, String province) {
        this.district   = district;
        this.province   = province;
    }

    public String toString() {
        return "( province = " + this.province + ", district = " + this.district + " )";
    }

}

public class ShallowCloning {
    public static void main(String[] args) throws CloneNotSupportedException{
        Address     address     = new Address("Cuchi", "HCM");
        Person      person1     = new Person(52, "Hien Pham", address);
        Person      person2     = person1.clone();


        System.out.println("Chỉ có class Person implements Cloneable, và override method clone()");
        System.out.println("Cho nên method clone() chỉ dừng lại ở class Person");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println();

        System.out.println("person1.Address & person2.Address đều cùng 1 reference");
        System.out.println("Person 1    : " + getObjectAddress(person1));
        System.out.println("Address 1   : " + getObjectAddress(person1.address));
        System.out.println("Person 2    : " + getObjectAddress(person2));
        System.out.println("Address 2   : " + getObjectAddress(person2.address));
        System.out.println();

        System.out.println("Sau khi thay đổi giá trị 1 số thuộc tính");
        System.out.println("thay đổi id của person1");
        person1.id = 800;
        System.out.println("thay đổi district của person2");
        person2.address.district = "Q12";

        System.out.println(person1);
        System.out.println(person2);
        System.out.println();

        System.out.println("Do class Address không implements Cloneable");
        System.out.println("Nên thuộc tính province hay district của bất kỳ đối tượng nào thay đổi");
        System.out.println("thì đối tượng còn lại cũng thay đổi theo");
    }

    public static String getObjectAddress(Object obj) {
        return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
    }
}
