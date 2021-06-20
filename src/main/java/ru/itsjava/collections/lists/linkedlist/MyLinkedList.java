package ru.itsjava.collections.lists.linkedlist;


public class MyLinkedList {
    private Node head;

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

//    public boolean remove(Object o) {
//        if (o == null) {
//            for (Node<E> x = first; x != null; x = x.next) {
//                if (x.item == null) {
//                    unlink(x);
//                    return true;
//                }
//            }
//        } else {
//            for (Node<E> x = first; x != null; x = x.next) {
//                if (o.equals(x.item)) {
//                    unlink(x);
//                    return true;
//                }
//            }
//        }
//        return false;
//    }


    public void clear() {

//        Node e = this.head;
//        while (e != head) {
//            Node next = e.getNext();
//            e.getValue() = null;
//            e = null;
//            e = next;
//        }
//        head.getNext() = head;
//        size = 0;
//        modCount++;
//    }
//        for (Node<> x = first; x != null; ) {
//            Node<E> next = x.next;
//            x.item = null;
//            x.next = null;
//            x.prev = null;
//            x = next;
//        }
//        first = last = null;
//        size = 0;
//        modCount++;
    }

    public Object get(int index) {
        return null;
    }

//    public Object set(int index, Object element) {
//        checkElementIndex(index);
//        Node<E> x = node(index);
//        E oldVal = x.item;
//        x.item = element;
//        return oldVal;
//    }


    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

//    public int indexOf(Object o) {
//        int index = 0;
//        if (o == null) {
//            for (Node<E> x = first; x != null; x = x.next) {
//                if (x.item == null)
//                    return index;
//                index++;
//            }
//        } else {
//            for (Node<E> x = first; x != null; x = x.next) {
//                if (o.equals(x.item))
//                    return index;
//                index++;
//            }
//        }
//        return -1;
//    }

//    public int lastIndexOf(Object o) {
//        int index = size;
//        if (o == null) {
//            for (Node<E> x = last; x != null; x = x.prev) {
//                index--;
//                if (x.item == null)
//                    return index;
//            }
//        } else {
//            for (Node<E> x = last; x != null; x = x.prev) {
//                index--;
//                if (o.equals(x.item))
//                    return index;
//            }
//        }
//        return -1;
//    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
