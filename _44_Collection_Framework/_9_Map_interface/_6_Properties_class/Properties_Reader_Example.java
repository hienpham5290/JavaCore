package _44_Collection_Framework._9_Map_interface._6_Properties_class;

import java.io.FileReader;
import java.util.Properties;

public class Properties_Reader_Example {
    public static void main(String[] args) throws Exception {
        // init FileReader's object
        FileReader fileReader = new FileReader("D:\\Learning\\Java\\JavaOOP\\src\\_44_Collection_Framework\\" +
                "_9_Map_interface\\_6_Properties_class\\database.config.properties");

        // init Properties' object
        Properties properties = new Properties();

        // load data into Properties' object from FileReader's object
        properties.load(fileReader);

        // Output data of Properties' object
        System.out.println("database=" + properties.getProperty("database"));
        System.out.println("dbpassword=" + properties.getProperty("dbpassword"));
        System.out.println("dbuser=" + properties.getProperty("dbuser"));
    }
}
