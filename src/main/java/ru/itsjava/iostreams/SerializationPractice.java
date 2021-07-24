package ru.itsjava.iostreams;

import ru.itsjava.collections.lists.maps.Man;

import java.io.*;

public class SerializationPractice {
    public static void main(String[] args) {
//        Man man = new Man("Oleg");
//
//        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/man.txt"))){
//            objectOutputStream.writeObject(man);
//        } catch (IOException exception){
//            exception.printStackTrace();
//        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/resources/man.txt"))) {
            Object o = objectInputStream.readObject();
            Man man = (Man) o;
            System.out.println(man);
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
