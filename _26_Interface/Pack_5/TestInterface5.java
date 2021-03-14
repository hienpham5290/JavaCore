package _26_Interface.Pack_5;

/**
 * interface lồng nhau
 *
 * 1 interface có thể chứa 1 interface khác, gọi là các interface lồng nhau
 *
 * dù là 1 interface trong 1 interface, nhưng khi 1 lớp implements interface nào, thì chỉ override method của interface đó
 *
 */

interface Printable {
    void Print();

    interface Writeable {
        void Write();
    }
}

//public class TestInterface5 implements Printable.Writeable {
//    @Override
//    public void Write() {
//        System.out.println("Writing....");
//    }
//
//    public static void main(String[] args) {
//
//    }
//}

public class TestInterface5 implements Printable {

    @Override
    public void Print() {
        System.out.println("Printing....");
    }

    public static void main(String[] args) {

    }
}
