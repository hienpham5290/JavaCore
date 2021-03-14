package _44_Collection_Framework._9_Map_interface._6_Properties_class;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Properties_Output_Example {
    public static void main(String[] args) throws Exception{
        OutputStream outputStream = null;
        try {
            // initial a output stream file by FileOutputStream's object at project's root folder
            // outputStream = new FileOutputStream("database.config.properties");

            // or we can choose any location
            outputStream = new FileOutputStream("D:\\Learning\\Java\\JavaOOP\\src\\_44_Collection_Framework\\" +
                    "_9_Map_interface\\_6_Properties_class\\database.config.properties");

            // initial Properties object
            Properties properties = new Properties();

            // setProperty key-value to Properties' object
            properties.setProperty("database", "localhost");
            properties.setProperty("dbuser", "coderlangthang");
            properties.setProperty("dbpassword", "password");

            // store Properties object into file .properties by FileOutputStream's object
            properties.store(outputStream, "Config Database Connection");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
    }
}
