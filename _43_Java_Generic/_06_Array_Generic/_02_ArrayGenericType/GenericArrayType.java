package _43_Java_Generic._06_Array_Generic._02_ArrayGenericType;

public class GenericArrayType<T> {
    private T[] array;

    public GenericArrayType(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T getFirstElementInArray() {
        if (this.array == null || this.array.length == 0) {
            return null;
        }

        return this.array[0];
    }

    public T getLastElementInArray() {
        if (this.array == null || this.array.length == 0) {
            return null;
        }
        return this.array[this.array.length - 1];
    }
}
