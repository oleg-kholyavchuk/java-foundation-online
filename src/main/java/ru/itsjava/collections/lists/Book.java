package ru.itsjava.collections.lists;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class Book {
    private final String title;
    private final String author;
    private final int numberOfPages;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, numberOfPages);
    }

    @Override
    public String toString() {
        return  " \n " + "Книги:  " + title + ", Автор:  " + author  + " Страницы " + numberOfPages +'}';
    }
}
