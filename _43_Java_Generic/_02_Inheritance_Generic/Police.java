package _43_Java_Generic._02_Inheritance_Generic;

/*
    Police<P> extends Person<String, Integer>
    thêm kiểu Generics P cho riêng lớp Police
    đồng thời chỉ định rõ kiểu dữ liệu cho tham số Generics
    ở lớp cha Person
 */

public class Police<P> extends Person<String, Integer>{
    private P position;

    public Police(String key, Integer value, P position) {
        super(key, value);
        this.position = position;
    }

    public P getPosition() {
        return position;
    }

    public void setPosition(P position) {
        this.position = position;
    }
}
