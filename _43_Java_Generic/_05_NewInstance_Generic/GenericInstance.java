package _43_Java_Generic._05_NewInstance_Generic;

import java.lang.reflect.InvocationTargetException;

public class GenericInstance<T> {
    // khai báo đối tượng kiểu Generic <T>
    private T obj;

    // constructor khởi tạo đối tượng kiểu Generic <T> sử dụng Reflection
    public GenericInstance(Class<T> clazz)
            throws InstantiationException, IllegalAccessException,
            NoSuchMethodException, InvocationTargetException {

        this.obj = (T) clazz.getDeclaredConstructor().newInstance();
    }

    // getter
    public T getObj() {
        return obj;
    }
}
