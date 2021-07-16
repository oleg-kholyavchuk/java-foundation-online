package ru.itsjava.iostreams;

import java.io.*;

public class HomePractice {
    public static void main(String[] args) throws IOException {

        String temp1;
        String temp2;

        File input_file = new File("src/main/resources/input_file.txt");
        try (PrintWriter printWriter = new PrintWriter(input_file)) {
            printWriter.println("Привет! Как дела?");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(input_file));) {
            String input;
            while ((input = reader.readLine()) != null)
                System.out.println("reader.readLine(1) = " + input);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        File out_file = new File("src/main/resources/out_file.txt");
        try (PrintWriter printWriter = new PrintWriter(out_file)) {
            printWriter.println("Спасибо. Хорошо!");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }


        try (BufferedReader reader = new BufferedReader(new FileReader(out_file));) {
            String input;
            while ((input = reader.readLine()) != null)
                System.out.println("reader.readLine(2) = " + input);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        BufferedReader reader1 = new BufferedReader(new FileReader(input_file));
        BufferedReader reader2 = new BufferedReader(new FileReader(out_file));

        temp1 = reader1.readLine();
        temp2 = reader2.readLine();
        System.out.println(temp1 + temp2);

        try (PrintWriter out1 = new PrintWriter(new FileWriter(input_file))) {
            out1.println(temp2);
            System.out.println("reader.readLine(3) = " + temp2);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        try (PrintWriter out2 = new PrintWriter(new FileWriter(out_file))) {
            out2.println(temp1);
            System.out.println("reader.readLine(4) = " + temp1);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}


