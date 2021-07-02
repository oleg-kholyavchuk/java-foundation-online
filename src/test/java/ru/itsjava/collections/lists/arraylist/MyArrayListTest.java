package ru.itsjava.collections.lists.arraylist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    private final MyArrayList listTest = new MyArrayList();


    @Test
    public void MyArrayListTesting() {
        assertEquals(0, listTest.size());
    }

    @Test
    public void MyArrayListIsEmpty() {
        assertFalse(1 < listTest.size());
        assertTrue(0 == listTest.size());
    }

    @Test
    public void MyArrayListIndexOf() {
        listTest.add("Пока1");
        assertEquals(0, listTest.indexOf("Пока1"));
        listTest.add("Пока2");
        assertEquals(-1, listTest.indexOf("Пока3"));
    }

    @Test
    public void MyArrayListLastIndexOf() {
        assertEquals(-1, listTest.lastIndexOf("0"));
        listTest.add("1");
        assertEquals(0, listTest.lastIndexOf("1"));
        listTest.add("2");
        assertEquals(1, listTest.lastIndexOf("2"));
        listTest.add("3");
        listTest.add("3");
        assertEquals(3, listTest.lastIndexOf("3"));
        listTest.add("4");
        assertEquals(4, listTest.lastIndexOf("4"));
        assertEquals(-1, listTest.lastIndexOf("5"));
    }

    @Test
    public void MyArrayListToString() {
        assertEquals("MyArrayList{}", listTest.toString());
        listTest.add("Пока1");
        listTest.add("Пока2");
        listTest.add("Пока3");
        listTest.add("Пока4");
        assertEquals("MyArrayList{Пока1 Пока2 Пока3 Пока4 }", listTest.toString());

    }

    @Test
    public void MyArrayListisCheckIndex() {
        assertTrue(3 > -1 && 3 < 5);
        listTest.add("Пока1");
        assertEquals(0, listTest.lastIndexOf("Пока1"));
    }

    @Test
    public void MyArrayListAdd() {
        assertEquals(true, listTest.add(" "));
    }

    @Test
    public void MyArrayListRemoveIndex() {
        listTest.add("1");
        listTest.add("2");
        listTest.add("3");
        listTest.add("4");
        listTest.add("5");
        listTest.add("6");
        assertEquals("1", listTest.remove(0));
        assertEquals(5, listTest.size());
        assertEquals("3", listTest.remove(1));
        assertEquals(4, listTest.size());
        listTest.add("8");
        listTest.add("9");
        listTest.add("10");
        assertEquals("5", listTest.remove(2));
    }

    @Test
    public void MyArrayListRemoveObject() {
        listTest.add("1");
        listTest.add("2");
        listTest.add("3");
        assertTrue(listTest.remove("2"));
        assertFalse(listTest.remove("4"));
        assertEquals(2, listTest.size());
    }

    @Test
    public void MyArrayListTestAdd() {
        assertTrue(listTest.add("Пока"));
        assertEquals(1, listTest.size());
    }

    @Test
    public void MyArrayListGet() {
        listTest.add("Пока1");
        listTest.add("Пока2");
        assertEquals("Пока1", listTest.get(0));
        assertEquals("Пока2", listTest.get(1));
    }

    @Test
    public void MyArrayListSet() {
        listTest.add("Пока1");
        listTest.add("Пока2");
        assertSame("Пока3", listTest.set(0, "Пока3"));
        assertSame("Пока4", listTest.set(1, "Пока4"));
    }

    @Test
    public void MyArrayListClear() {
        listTest.add("Пока");
        listTest.clear();
        assertEquals(0, listTest.size());
    }

    @Test
    public void MyArrayListContains() {
        listTest.add("Пока1");
        listTest.add("Пока2");
        assertTrue(listTest.contains("Пока1"));
        assertTrue(listTest.contains("Пока2"));
        assertFalse(listTest.contains("Пока3"));
        assertFalse(listTest.contains(""));
    }

    @Test
    public void MyArrayListEmpty() {
        assertTrue(0 == listTest.size());
        listTest.add("Пока");
        assertFalse(0 == listTest.size());
    }

    @Test
    public void MyArrayListSize() {
        assertEquals(0, listTest.size());
    }
}
