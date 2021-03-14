package _34_instanceof;

/**
 * UPCASTING
 *
 * trong Java, trừ interface, còn lại tất cả các class khác đều không hỗ trợ đa kế thừa
 * 1 class cha có thể có nhiều class con
 * 1 class con chỉ có duy nhất 1 class cha ( trừ khi implement interface thì có thể implements nhiều interface )
 *
 * 1 đối tượng thuộc kiểu của class con là thể hiện của class con và cả class cha, do đó có thể coi đối tượng của class con là đối tượng của class cha
 * từ đó ta có thể tạo 1 đối tượng thuộc kiểu của class cha, nhưng có thể hiện của class con, bằng cơ chế upcasting
 *
 * thông qua đối tượng đã UPCASTING, ta có thể gọi phương thức đã override ở lớp con thông qua đối tượng của lớp
 * cha, nếu ở lớp con không override thì chỉ gọi phương thức ở chính lớp cha, phương thức của lớp con thì không thể gọi được
 * từ đối tượng có kiểu lớp cha thực hiện UPCASTING
 *
 * đối tượng có thể hiện và kiểu của lớp con, thì có thể gọi phương thức của chính lớp con, phương thức đã override, và cả
 * phương thức không override nằm ở lớp cha
 *
 * đối tượng có thể hiện và kiểu của lớp cha, thì chỉ có thể gọi phương thức ở chính lớp cha, không thể gọi phương thức nằm ở
 * lớp con, và cả phương thức mà lớp con đã override nằm ở lớp con
 * nếu muốn gọi phương thức mà lớp con đã override nằm ở lớp con, thì đối tượng này phải thực hiện UPCASTING
 *
 */

class SuperClass {
    void Show() {
        System.out.println("I am Super Class");
    }

    void Print() {
        System.out.println("I am Print in Super Class");
    }
}

class SubClass extends SuperClass {
    void Show() {
        System.out.println("I am Sub Class");
    }

    void Out() {
        System.out.println("I am Out in Sub Class");
    }
}

public class C_InstanceOfUpcasting {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        SuperClass superClass = new SuperClass();

        // UPCASTING
        SuperClass upcasting1 = subClass; // implicit
        SuperClass upcasting2 = (SuperClass) subClass; // explicit
        SuperClass upcasting3 = new SubClass(); // explicit

        // ĐỐI TƯỢNG CÓ KIỂU LỚP CHA, INSTANCE OF LỚP CON
        // đối tượng thực hiện Up Cast gọi phương thức ở lớp con đã override lại từ lớp cha
        upcasting1.Show(); // I am Sub Class
        // đối tượng thực hiện Up Cast  gọi phương thức nằm ở lớp cha, vì phương thức này lớp con không override
        upcasting1.Print(); // I am Print in Super Class
        // đối tượng thực hiện upcasting không thể gọi phương thức của chính lớp con, trừ khi phương thức đó cũng có ở lớp cha, và lớp con override lại
//        upcasting1.Out();

        // đối tượng có thể hiện và kiểu lớp cha chỉ có thể gọi những phương thức của chính lớp cha
        superClass.Show(); // I am Super Class
        superClass.Print(); // I am Print in Super Class

        // lớp con đã ghi đè phương thức Show(), đối tượng con gọi sẽ gọi phương thức nằm ở lớp con
        subClass.Show(); // I am Sub Class
        // đối tượng thuộc lớp con có thể gọi phương thức nằm ở lớp cha, nếu lớp con không ghi đè phương thức đó
        subClass.Print(); // I am Print in Super Class
        // Out() là phương thức của lớp con
        subClass.Out(); // I am Out in Sub Class
    }
}
