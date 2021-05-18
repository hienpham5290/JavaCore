package _43_Java_Generic._05_NewInstance_Generic;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException,
            InvocationTargetException, NoSuchMethodException {

        GenericInstance<Student>  genericInstance = new GenericInstance<>(Student.class);

        Student student = genericInstance.getObj();

        System.out.println(student);
    }
}
