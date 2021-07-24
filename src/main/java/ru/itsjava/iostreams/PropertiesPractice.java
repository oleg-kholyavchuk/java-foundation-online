package ru.itsjava.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesPractice {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/application.properties");

        Properties prop = new Properties();
        prop.load(new FileInputStream(file));
        System.out.println("prop.getProperty(\"key1\") = " + prop.getProperty("key1"));

        prop.setProperty("key2", "value2");
        System.out.println("prop.getProperty(\"key2\") = " + prop.getProperty("key2"));

        ClassLoader classLoader = PropertiesPractice.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("application.properties");

        Properties propFromStem = new Properties();
        propFromStem.load(inputStream);
        System.out.println("propFromStem.getProperty(\"key1\") = " + propFromStem.getProperty("key1"));
    }
}
