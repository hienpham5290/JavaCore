package _26_Interface.Pack_2;

/**
 * interface - ví dụ đa kế thừa - normal class implements từ nhiều interface,
 * các interface cách nhau bởi dấu phẩy sau implements
 *
 */

interface Printable {
    public abstract void Print();
}

interface Showable {
    public abstract void Show();
}

public class TestInterface2 implements Printable, Showable{
    @Override
    public void Print() {
        System.out.println("Hello");
    }

    @Override
    public void Show() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        TestInterface2 obj = new TestInterface2();
        obj.Print();
        obj.Show();
    }
}
