package _26_Interface.Pack_4;

/**
 * sự kế thừa của interface
 *
 * 1 interface có thể kế thừa từ nhiều interface
 *
 * khi 1 normal class implements 1 interface, thì phải override tất cả các phương thức từ interface đó trở lên
 *
 */

interface Printable {
    public abstract void Print();
}

interface Writeable {
    public abstract void Write();
}

interface Showable extends Printable, Writeable {
    public abstract void Show();
}

public class TestInterface4 implements Showable {
    @Override
    public void Print() {
        System.out.println("Hello");
    }

    @Override
    public void Show() {
        System.out.println("Welcome");
    }

    @Override
    public void Write() {
        System.out.println("Hi...There !!!");
    }

    public static void main(String[] args) {
        TestInterface4 obj = new TestInterface4();
        obj.Print();
        obj.Show();
        obj.Write();
    }


}
