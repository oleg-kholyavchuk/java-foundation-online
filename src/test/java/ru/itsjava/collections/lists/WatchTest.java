package ru.itsjava.collections.lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс Watch должен: ")
public class WatchTest {

    public static final String DEFAULT_FIRM = "SEIKO";
    public static final String DEFAULT_AUTHOR = "Vova";
    public static final double DEFAULT_PRICE = 10000.0;
    public static final String NEW_AUTHOR = "Masha";
    public static final double NEW_PRICE = 500.0;

    @DisplayName(" корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor() {
        Watch actualWatch = new Watch(DEFAULT_FIRM, DEFAULT_AUTHOR, DEFAULT_PRICE);

//        assertEquals("SEIKO", actualWatch.getFirm());
//        assertEquals("Vova", actualWatch.getAuthor());
//        assertEquals(10000.0, actualWatch.getPrice());

        assertAll("actualWatch", () -> assertEquals(DEFAULT_FIRM, actualWatch.getFirm()),
                () -> assertEquals(DEFAULT_AUTHOR, actualWatch.getAuthor()),
                () -> assertEquals(DEFAULT_PRICE, actualWatch.getPrice()));
    }

    @DisplayName(" корректно изменяет автора")
    @Test
    public void shouldHaveCorrectUpdateWatch() {
        Watch actualWatch = new Watch(DEFAULT_FIRM, DEFAULT_AUTHOR, DEFAULT_PRICE);

        actualWatch.setAuthor(NEW_AUTHOR);
        actualWatch.setPrice(NEW_PRICE);

        assertEquals(NEW_AUTHOR, actualWatch.getAuthor());
    }
}
