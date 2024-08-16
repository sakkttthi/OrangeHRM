package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    static Properties prop = new Properties();

    public static void loadProperties() throws IOException {
        FileInputStream input = new FileInputStream("src/main/resources/config/env.properties");
        prop.load(input);
    }

	public String getprop(String string) {
		return prop.getProperty(string);
	}
}
