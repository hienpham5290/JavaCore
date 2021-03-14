package _39_Nested_Class;

public class Les3_OuterClass {
    public void show() {
        InnerClass innerClass = new InnerClass();
        innerClass.show();
    }

    public class InnerClass {
        public void show() {
            System.out.println("Inner Class");
        }
    }
}
