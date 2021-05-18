package _43_Java_Generic._03_Interface_Generic;

/*
    cài đặt 1 interface với kiểu Generics T
 */
public interface GenericsDAO<T> {
    void insert(T obj);
    void update(T obj);
}
