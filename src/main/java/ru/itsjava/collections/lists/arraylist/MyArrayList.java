package ru.itsjava.collections.lists.arraylist;

public class MyArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private int realSize;
    private Object[] array;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        if (realSize == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(Object o) {
        return indexOf(o.toString()) > -1;
    }


    public boolean add(Object o) {
        if (realSize == array.length) {
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            //копирование массива
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
        }
        //вставка нашего элемента
        array[realSize++] = o;
        return true;
    }

    private void fastRemove(int index) {
        int numMoved = realSize - index - 1;
        if (numMoved > 0)
            System.arraycopy(array, index + 1, array, index,
                    numMoved);
        array[--realSize] = null; // clear to let GC do its work
    }

    public boolean remove(Object o) {

        if (o == null) {
            for (int index = 0; index < realSize; index++)
                if (array[index] == null) {
                    fastRemove(index);
                    return true;
                }
        } else {
            for (int index = 0; index < realSize; index++)
                if (o.equals(array[index])) {
                    fastRemove(index);
                    return true;
                }
        }
        return false;
//        int delIndex = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != null && array[i].equals(o)) {
//                delIndex = i;
//                break;
//            }
//        }
//        if (array.length - 1 - delIndex >= 0) {
//            System.arraycopy(array, delIndex + 1, array, delIndex, array.length - 1 - delIndex);
//        }
//        if (delIndex == -1) {
//            return false;
//        } else {
//            realSize--;
//            return true;
//        }
    }

    public void clear() {
        for (int i = 0; i < realSize; i++) {
            array[i] = null;
            realSize = 0;
        }
    }

    public Object get(int index) {
        checkIndex(index);
//        if (index < 0 || index >= this.realSize)
//            throw new IllegalArgumentException();
        return array[index];

    }

    public Object set(int index, Object element) {
        checkIndex(index);
//        if (index < 0 || index >= this.realSize)
//            throw new IllegalArgumentException();
        return array[index] = element;
    }

    public void add(int index, Object element) {
        if (realSize >= array.length) { // сравнение реального размера с массивом
            realSize++; // увелечение массива на один
            Object[] resArray = new Object[3 * 2 * realSize + 1];  // создание массива
            System.arraycopy(array, 0, resArray, 0, index); // копирование элементов массива
            System.arraycopy(array, index, resArray, index + 1, realSize - index); // копирование элементов массива
            array = resArray; // присвоение массиву значение массива resArray
            array[index] = element; // запись объекта в массив по индексу
        }
        realSize++; // увелечение массива на один
        System.arraycopy(array, index, array, index + 1, realSize - index); // копирование элементов массива
        array[index] = element; // запись объекта в массив по индексу
    }

    public Object remove(int index) {
        checkIndex(index);
        Object resElement = array[index];
        if (array.length - 1 - index >= 0) {
            System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        }
        realSize--;
        return resElement;
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArithmeticException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) && (index < realSize)) {
            return true;
        }
        return false;
    }

    public int indexOf(Object o) {
        int temp = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == o) {
                temp = i;
                break;
            }
        }
        return temp;
    }

    public int lastIndexOf(Object o) {
        int temp = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == o) {
                temp = i;
            }
        }
        return temp;
    }

    public String toString() {
        //return "MyArrayList{" + Arrays.toString(array) + '}';
        StringBuilder stringBuilder = new StringBuilder("MyArrayList{");
        for (int i = 0; i < realSize; i++) {
            stringBuilder.append(array[i]).append(' ');
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
