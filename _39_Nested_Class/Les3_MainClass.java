package _39_Nested_Class;

public class Les3_MainClass {
    public static void main(String[] args) {
        Les3_OuterClass outerClass = new Les3_OuterClass();
        outerClass.show();

        Les3_OuterClass outerClass1 = new Les3_OuterClass();
        Les3_OuterClass.InnerClass innerClass1 = outerClass1.new InnerClass();
        outerClass1.show();
    }
}
