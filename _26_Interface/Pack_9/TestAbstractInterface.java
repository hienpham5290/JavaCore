package _26_Interface.Pack_9;

interface A {
    void a();
    abstract void b();
    public void c();
    public abstract void d();
}

abstract class B implements A {
    public void c() {
        System.out.println("I am c()");
    }
}

class C extends B {
    @Override
    public void a() {
        System.out.println("I am a()");
    }

    @Override
    public void b() {
        System.out.println("I am b()");

    }

    @Override
    public void d() {
        System.out.println("I am d()");

    }


}

public class TestAbstractInterface {
    public static void main(String[] args) {
        A a = new C(); // upcasting
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
