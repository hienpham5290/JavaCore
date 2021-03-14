package _34_instanceof;

class Parent {
    void Show() {
        System.out.println("Show() in Parent");
    }

    void Print() {
        System.out.println("Print() in Parent");
    }
}

class Child extends Parent {
    void Show() {
        System.out.println("Show() in Child");
    }

    void Out() {
        System.out.println("Out() in Child");
    }
}

public class D_InstanceOfDowncasting {
    public static void main(String[] args) {
        // UPCASTING
        Parent parent = new Child();

        // DOWNCASTING
//        Child child = (Child) parent;

        // DÙNG INSTANCEOF ĐỂ KIỂM TRA KIỂU, NẾU ĐÚNG THÌ CHO PHÉP THỰC HIỆN DOWNCASTING
        Child child;

        child = downcasting(parent);

        child.Show(); // Show() in Child
        child.Print(); // Print() in Parent
        child.Out(); // Out() in Child


//        Parent parent = new Parent();
//        Child child = (Child) parent;
    }

    static Child downcasting(Parent parent) {
        if (parent instanceof Child) {
            Child c = (Child) parent;
            return c;
        } else return null;
    }
}
