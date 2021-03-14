package _34_instanceof;

interface Contract{

}

class Example implements Contract {

}

public class E_InstanceOfInterface {
    public static void main(String[] args) {
        Example example = new Example();

        System.out.println(example instanceof Contract); // true
    }
}
