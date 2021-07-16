package ru.itsjava.iostreams;

import java.io.*;

public class HomePracticeSerialization {
    public static void main(String[] args) {
        User login = new User("admin", 123456);

//        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/serializ.txt"))) {
//            outputStream.writeObject(login);
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/resources/serializ.txt"))) {
            Object o = objectInputStream.readObject();
            User log = (User) o;
            System.out.println(log);
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
