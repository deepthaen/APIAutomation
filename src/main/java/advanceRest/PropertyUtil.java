package advanceRest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {


    public String getProperty(String key) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("./config.properties"));
        return prop.getProperty(key);
    }

    public static void main(String[] args) {

    }

}
