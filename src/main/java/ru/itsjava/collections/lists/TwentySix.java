package ru.itsjava.collections.lists;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@Data
@AllArgsConstructor
public class TwentySix {
    public static void main(String[] args) {
        List<Book> bookListEmpty = new ArrayList<>();
        List<Book> bookList = new ArrayList<>(20);

        Book firstBook = new Book("Букварь", "Всеслав Горецкий", 96);
        Book twentiethBook = new Book("Чистый код", "Роберт Мартин", 464);
        Book seventhBook = new Book("Head First Java", "Kathy Sierra, Bert Bates", 720);
        Book secondOneBook = new Book("Java Руководство для начинающих", "Герберт Шилдт", 816);
        Book thirdBook = new Book("Java для чайников", "Барри Бёрд", 624);
        Book fourthBook = new Book("Java Библиотека профессионала", "Кей С. Хорстманн, Гари Корнелл", 864);
        Book fifthook = new Book("Философия Java", "Брюс Эккель", 1168);
        Book javaBook = new Book("Java", "Java", 0);
        for (int i = 2; i < 7; i++) bookList.add(firstBook);
        for (int i = 6; i < 17; i++) bookList.add(javaBook);

        bookList.add(firstBook);
        bookList.add(0, firstBook);
        bookList.add(1, javaBook); // null
        bookList.add(7, seventhBook);
        bookList.add(twentiethBook);

        System.out.println(bookList);
        System.out.println(bookList.get(0) +
                " числится под номером " + 0);
        System.out.println(bookList.get(20) +
                " числится под номером " + 20);
        bookList.add(1, seventhBook);
        for (int i = 0; i < 20; i++) {
            bookList.remove(1);
            bookList.add(1, seventhBook);
            bookList.remove(3);
            bookList.add(3, twentiethBook);
        }

        System.out.println(bookList);

        List<Book> bookListEmptyTemp = new ArrayList<>(bookList);
        System.out.println("Новый лист");
        System.out.println(bookListEmptyTemp);

        bookListEmptyTemp.clear();
        System.out.println("-----------------");
        System.out.println(bookListEmptyTemp);
        System.out.println("-----------------");

        System.out.println("List: " + bookList.toString());
        System.out.println();
        System.out.println("Вторая часть");

        for (int i = 0; i < 20; i++) {
            bookList.remove(15);
            bookList.add(15, secondOneBook);
            bookList.remove(12);
            bookList.add(12, thirdBook);
            bookList.remove(17);
            bookList.add(17, fourthBook);
            bookList.remove(19);
            bookList.add(19, fifthook);
        }
        System.out.println(bookList);
        System.out.println("------------------");

        for (int i = 0; i < bookList.size(); i++) {
            if (i % 3 == 0) {
                System.out.print(bookList.get(i));
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Выводим книги Java ");
        for (Book book : bookList) {
            if (book.getTitle().equals("Java")) {
                System.out.print(book);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Пропустить 3 первых элемента");
        for (int i = 0; i < 20; i++) {
            if (i > 3) {
                System.out.print(bookList.get(i));
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Пропустить несколько элементов");
        for (int i = 0; i < 20; i++) {
            if (i > 15) {
                System.out.print(bookList.get(i));
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Пропустить первые две книги которые равны 'Java' ");
        int bookTemp = 0;
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals("Java") && bookTemp < 2) {
                bookTemp++;
            } else {
                System.out.print(bookList.get(i));
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Возвращаем первую книгу, длина автора которого делится на 3");
//        int bookTemp2 = 0;
//        for (int i = 0; i < bookList.size(); i++) {
//            if (bookList.get(i).getAuthor().equalsIgnoreCase(2) && bookTemp2 % 3) {
//                System.out.print(bookList.get(i));
//                break;
//            }

        Person person1 = new Person("Вася", 24, 'm');
        Person person2 = new Person("Петя", 29, 'm');
        Person person3 = new Person("Марины", 19, 'g');
        Person person4 = new Person("Света", 9, 'g');
        Person person5 = new Person("Василий", 49, 'm');
        Person person6 = new Person("Оля", 26, 'g');
        Person person7 = new Person("Николай", 26, 'm');

        List<Person> personList = new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5, person6, person7));
        System.out.println();
        System.out.println("Призывник");
        for (Person age : personList) {
            if (age.getAge() > 18 && age.getAge() < 29 && age.getIsMale() == 'm' && age.getName().startsWith("Н")) {
                System.out.print("Призывники " + age + " ");
            }
        }
        System.out.println();
        System.out.println("Найти средний возраст женщин");
        int temp = 0;
        for (Person age : personList) {
            if (age.getIsMale() == 'g') {
                temp += age.getAge();
                System.out.print("Женщины " + (temp / 3) + " ");
            }
        }
    }
}



