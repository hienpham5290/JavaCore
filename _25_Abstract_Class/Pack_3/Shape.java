package _25_Abstract_Class.Pack_3;

public abstract class Shape {
    public abstract void draw();
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Ve hinh vuong....");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Ve hinh tron....");
    }
}

class Main {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.draw();
    }
}
