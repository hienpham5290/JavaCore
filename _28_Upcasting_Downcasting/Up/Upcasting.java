package _28_Upcasting_Downcasting.Up;

class Animal {
    int id;
    String name;

    public void animalMethod() {
        System.out.println("animalMethod in Animal class");
    }

    public void ShowAnimal() {
        System.out.println("id: " + this.id + ", name: " + this.name);
    }
}

class Dog extends Animal {
    String colorFur;
    int age;

    public void animalMethod() {
        System.out.println("animalMethod in Dog class");
    }

    public void ShowDog() {
        System.out.println("color fur: " + this.colorFur + ", age: " + this.age);
    }
}

public class Upcasting {
    public static void main(String[] args) {
        // cách 1: explicitly upcasting ( ép kiểu lên tường minh )
        // b1: khởi tạo 1 đối tượng thuộc kiểu child class, là instance của child class
        // b2: khởi tạo 1 biến đối tượng thuộc kiểu của parent class, reference đến đối tượng của child class
        // có thể ghi rõ hoặc không việc tường minh đối tượng của lớp con ép lên lớp cha: (ParentClass) child-obj
        Dog d = new Dog();
        Animal a = (Animal) d; // explicitly upcasting
//        Animal a = d;           // implicitly upcasting

        // cách 2: implicitly upcasting ( ép kiểu lên ngầm định )
        // chỉ việc khởi tạo 1 biến object thuộc kiểu của lớp cha tham chiếu đến thể hiện của lớp con
        Animal a2 = new Dog();

        // với upcasting, đối tượng thuộc kiểu lớp cha, tham chiếu đến thể hiện của lớp con
        // chỉ có thể truy cập đến thuộc tính của lớp cha
        a.id = 12;
        a.name = "Lulu";
//        a.colorFur; // colorFur của child class, a không thể truy cập
//        a.age; // age của child class, a không thể truy cập

        // với upcasting, nếu lớp con override những phương thức của lớp cha
        // thì đối tượng thuộc kiểu của lớp cha gọi phương thức đó
        // sẽ gọi phương thức đã override từ lớp con ép kiểu lên lớp cha
        a.animalMethod();

        // những phương thức nào mà lớp con không override, thì phương thức được gọi
        // sẽ là phương thức nằm ở lớp cha
        a.ShowAnimal();

        // upcasting không thể gọi phương thức của lớp con, nếu muốn gọi, phải downcasting
//        a.ShowDog(); // compiler báo lỗi
    }
}
