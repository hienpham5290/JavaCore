package _08_This_Parameter_Constructor;

public class HelpPrint {
    Student8 obj;

    public HelpPrint(Student8 obj) {
        this.obj = obj;
    }

    void printInHelp() {
        System.out.println(
                "ID\t\t: " + this.obj.getId() + "\n" +
                "NAME\t: " + this.obj.getName()
        );
    }
}
