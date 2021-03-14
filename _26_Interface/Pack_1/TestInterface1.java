package _26_Interface.Pack_1;

/**
 * interface - ví dụ implements đơn giản
 *
 * normal class chỉ implements 1 interface
 *
 */

interface Printable {
    public abstract void Print();
}

public class TestInterface1 implements Printable{

    @Override
    public void Print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        TestInterface1 obj = new TestInterface1();
        obj.Print();
    }
}
