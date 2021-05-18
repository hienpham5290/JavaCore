package _43_Java_Generic._03_Interface_Generic;

public class GenericsDAOImpl<T> implements GenericsDAO<T> {
    @Override
    public void insert(T obj) {
        // do something
    }

    @Override
    public void update(T obj) {
        // do something
    }
}