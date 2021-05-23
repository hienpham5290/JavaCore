package _45_Java_IO._01_Serialization_Deserialization._02_Serializabl_Inheritance;

public class Engineer extends Person {
    private String certificate;

    public Engineer(int id, String name, String certificate) {
        super(id, name);
        this.certificate = certificate;
    }

    @Override
    public String toString() {
        return "Engineer [certificate=" + certificate + ", " + super.toString() + "]";
    }
}
