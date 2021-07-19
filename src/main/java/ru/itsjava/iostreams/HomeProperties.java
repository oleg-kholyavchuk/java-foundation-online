package ru.itsjava.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class HomeProperties {
    public static void main(String[] args) throws IOException {

        File file = new File("mysettings.properties");

        Properties prop = new Properties();
        prop.load(new FileInputStream(file));
        System.out.println("prop.getProperty(\"name\") = " + prop.getProperty("name"));
        System.out.println("prop.getProperty(\"nickname\") = " + prop.getProperty("nickname"));

        ClassLoader classLoader = PropertiesPractice.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("mysettings.properties");

        Properties propFromStem = new Properties();
        propFromStem.load(inputStream);
        System.out.println("propFromStem.getProperty(\"name\") = " + propFromStem.getProperty("name"));
        System.out.println("propFromStem.getProperty(\"nickname\") = " + propFromStem.getProperty("nickname"));
    }
}
