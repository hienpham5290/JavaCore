package _28_Upcasting_Downcasting.Down;

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

public class Downcasting {
    public static void main(String[] args) {
        // thử thực hiện downcasting ngầm định giống upcasting, sẽ bị lỗi
//        Dog d = new Animal(); compile time error

        // Compiler throws an exception: ClassCastException
//        Animal a = new Animal();
//        Dog d = (Dog) a;

        // CHỈ CÓ THỂ THỰC HIỆN DOWNCASTING TƯỜNG MINH
        // BẰNG CÁCH UPCASTING TRƯỚC
        // SAU ĐÓ DOWNCASTING
//        Dog d1 = new Dog();
//        Animal a = (Animal) d1; // upcasting cách 1:
        Animal a = new Dog();   // upcasting cách 2: a là 1 thể hiện của Dog
        Dog d = (Dog) a;        // downcasting: a là 1 thể hiện của Dog, nên ép về Dog được

        d.id = 12;
        d.name = "Lili";
        d.age = 2;
        d.colorFur = "brown";
        a.name = "Lolo";

        d.ShowAnimal();
        d.animalMethod();
        d.ShowDog();
    }
}
