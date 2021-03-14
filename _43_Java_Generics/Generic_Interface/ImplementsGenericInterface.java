package _43_Java_Generics.Generic_Interface;

// khai báo 1 class implements Generic Interface
// chỉ định rõ đối số cho tham số kiểu của Interface là String
// khai báo thêm 1 tham số kiểu Generic cho class là I
// kiểu I này sẽ được chỉ định rõ khi khởi tạo object

public class ImplementsGenericInterface<I> implements GenericInterface<String> {
    public String someThing;
    public I anyThing;

    @Override
    public String doSomeThing() {
        return someThing;
    }

    public I doAnyThing() {
        return anyThing;
    }
}
