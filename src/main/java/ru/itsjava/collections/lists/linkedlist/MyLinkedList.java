package ru.itsjava.collections.lists.linkedlist;


public class MyLinkedList {
    private Node head;
    private int size;

    public int size() {
        int size = 0;
        Node head = this.head;
        while (head != null) {
            head = head.getNext();
            size++;
        }
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    public int indexOf(Object o) {

        int index = 0;
        if (o == null) {
            for (Node temp = head; temp != null; temp = temp.getNext()) {
                if (temp.getValue() == null)
                    return index;
                index++;
            }
        } else {
            for (Node temp = head; temp != null; temp = temp.getNext()) {
                if (o.equals(temp.getValue()))
                    return index;
                index++;
            }
        }
        return -1;
    }

    public boolean add(Object o) {

        Node resNode = new Node(o, null);
        if (head == null) {
            head = new Node(o, null);
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(resNode);
        }
        return true;
    }

    public boolean remove(Object o) { // публичный метод возвращает значение буль. Параметор метода Object o
        if (head == null)
            return false; // сравнение переменной head класс на равенство с null. Если head равен null возвращаем false
        if (head.getValue().equals(o)) { // возвращаем значение Object из head, и сравниваем его с объектом о. Если они равны выполняется условие
            head = head.getNext(); // присваеваем переменной head следующие значение переменной head класса Node
            return true; // и тогда возвращаем true
        }
        if (head.getNext() == null) return false; // если следующие значение head равно null возвращаем false

        Node curNode = head; // создаем переменную класса Node curNode, и приравниваем к ней значение head
        Node prevNode = head; // создаем переменную класса Node prevNode, и приравниваем к ней значение head

        while ((curNode = curNode.getNext()) != null) { // создаем цикл. Условие его выполнения, следующие значение curNode не должно быть равно null
            if (curNode.getValue().equals(o)) { // в цикле идет сравнение curNode c Object o. Если они равны, выходим из цикла
                break; // выход из цикла
            }
            prevNode = prevNode.getNext(); // присваиваем следующие значение prevNode
        }
        if (curNode == null)
            return false; // сравнение curNode на равенство с null. Если условие выполнено, возвращаем false
        prevNode.setNext(curNode.getNext()); // присваиваем prevNode следующие значение curNode
        curNode.setNext(null); // присваиваем значение null curNode
        return true; // возвращаем true
    }

    public void clear() {
//        int size = 0;
//        Node head = this.head;
//        while (head != null) {
//            head = head.getNext();
//            size++;
//        }


        Node prevNode = head;
        Node curNode = head;
        for (int i = 0; i < size() - 1; i++) {
            prevNode.setNext(null);
            prevNode = curNode;
            curNode = curNode.getNext();
        }
        head = null;
        size = 0;
    }

    public Object get(int index) {
        checkIndex(index);
        Node item = head;
        for (int i = 0; i < index; i++) {
            item = item.getNext();
        }
        return item.getValue();
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        Node item = head;
        for (int i = 0; i < index; i++)
            item = item.getNext();
        Object value = item.getNext();
        item.setValue(element);
        return value;
    }


    public void add(int index, Object element) {

    }

    public Object remove(int index) {

        checkIndex(index);
        if (index == 0) {
            Object resValue = head.getValue();
            if (head.getNext() == null) {
                head = null;
            } else {
                head = head.getNext();
            }
            return resValue;
        }
        Node curNode = head;
        Node prevNode = head;
        int count = 0;
        while ((curNode = curNode.getNext()) != null) {
            count++;
            if (count == index) {
                break;
            }
            prevNode = prevNode.getNext();
        }
        if (curNode == null) return null;
        Object resValue = curNode.getValue();
        if (curNode.getNext() == null) {
            prevNode.setNext(null);

        } else {
            prevNode.setNext(curNode.getNext());
            curNode.setNext(null);
        }
        return resValue;
    }

    public int lastIndexOf(Object o) {

        int index = size();
        if (o == null) {
            for (Node temp = head; temp != null; temp = temp.getNext()) {
                index--;
                if (temp.getValue() == null)
                    return index;
                index++;
            }
        } else {
            for (Node temp = head; temp != null; temp = temp.getNext()) {
                index--;
                if (o.equals(temp.getValue()))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArithmeticException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) && (index < size())) {
            return true;
        }
        return false;
    }
}
