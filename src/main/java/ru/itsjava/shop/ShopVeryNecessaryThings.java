package ru.itsjava.shop;

import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ShopVeryNecessaryThings {
    public static void main(String[] args) {

        List<String> things = new ArrayList<>();
        Things things1 = new Things("fdfd");
        Things things2 = new Things("fdfdfd");
        Things things3 = new Things("www");
        Things things4 = new Things("aaa");

        things.add(String.valueOf(things1));
        things.add(String.valueOf(things2));
        things.add(String.valueOf(things3));
        things.add(String.valueOf(things4));

        System.out.println("Добро пожаловать в магазин нужных вещей");

        printMenu();
        Scanner console = new Scanner(System.in);

        while (true) {
            System.out.print("Введите номер меню ");
            int menuNum = console.nextInt();
            if (menuNum == 1) {
                printAllThings(things);

            } else if (menuNum == 2) {
                things = addThings(console,  things);

            } else if (menuNum == 3) {
                things = removeThings(console, things);

            } else if (menuNum == 4) {
                selectionSort(things);

            } else if (menuNum == 0) {
                System.out.println("Спасибо что воспользовались нашим магазином");
                System.exit(0);
            }
        }
    }

    private static List<String> addThings(Scanner console, List<String> things) {
        System.out.println("Введите какая вещь нужна");
        String inputThings = console.next();
        things.add(inputThings);
        return things;
    }

    private static List<String> removeThings(Scanner console, List<String> things) {
        System.out.println("Введите какую вещь удалить");
        int inputThings = Integer.parseInt(console.next());
        things.remove(inputThings);
        return things;
    }

    private static void printAllThings(List<String> things) {
        System.out.println("Наши вещи");
        System.out.println(things);
    }

    public static void selectionSort(List<String> things) {
        Collections.sort(things);
        System.out.println(things);
    }

    public static void printMenu() {
        System.out.println("Меню:\n" +
                "1. Вывести все вещи\n" +
                "2. Добавить вещь\n" +
                "3. Удалить вещь\n" +
                "4. Отсортировать вещи\n" +
                "5. Выход");
    }
}

