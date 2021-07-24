package ru.itsjava.oop;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс Person должен: ")
public class PersonTest {

    int age;
    public static final String DEFAULT_NAME = "Oleg";
    public static final int DEFAULT_AGE = 30;
    public static final String NEW_NAME = "Masha";
    public static final int NEW_AGE = 16;

    @DisplayName(" корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructorPerson() {
        Person actualMan = new Person(DEFAULT_NAME, DEFAULT_AGE);

        assertEquals("Oleg", actualMan.getName());
        assertEquals(30, actualMan.getAge());
    }

    @DisplayName(" корректно изменяет имя и возраст")
    @Test
    public void shouldHaveCorrectUpdatePerson() {
        Person actualMan = new Person(DEFAULT_NAME, DEFAULT_AGE);

        actualMan.setName(NEW_NAME);
        actualMan.setAge(NEW_AGE);

        assertEquals(NEW_NAME, actualMan.getName());
        assertEquals(NEW_AGE, actualMan.getAge());
    }

    @BeforeEach
    public void setUp() { // почему то не выполнилась
        age = 4 + 1;
    }

    @Test
    public void testGoodOne() {
        int temp = 5;
        assertEquals(temp, age);
    }

    @Test
    public void takeBeerAgeTest() {
        assertTrue(23 > 18);
        assertFalse(3 > 18);

    }
}



