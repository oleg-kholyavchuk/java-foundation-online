package ru.itsjava.collections.lists;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
@AllArgsConstructor
public class TwentySix {
    public static void main(String[] args) {
        List<Book> bookListEmpty = new ArrayList<>();
        List<Book> bookList = new ArrayList<>(20);

        Book firstBook = new Book("Букварь", "Всеслав Горецкий", 96);
        Book twentiethBook = new Book("Чистый код", "Роберт Мартин", 464);
        Book seventhBook = new Book("Head First Java", "Kathy Sierra, Bert Bates", 720);
        for (int i = 2; i < 7; i++) bookList.add(firstBook);
        for (int i = 6; i < 17; i++) bookList.add(null);


        bookList.add(firstBook);
        bookList.add(0, firstBook);
        bookList.add(1, null);
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

        for (int i = 0; i < 20; i++) {
            bookListEmptyTemp.clear();
        }
        System.out.println("-----------------");
        System.out.println(bookListEmptyTemp);
        System.out.println("-----------------");

        bookList.remove(seventhBook);
        bookList.remove(0);
        System.out.println(bookList);
        for (int i = 0; i < 20; i++) {
            System.out.println("bookList.get(20) = " + bookList.get(i));
        }
    }
}
