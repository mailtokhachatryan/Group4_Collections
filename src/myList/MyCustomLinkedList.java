package myList;

import java.util.Iterator;

public class MyCustomLinkedList implements MyList {


    private int size;

    private Node first;

    private Node last;

    @Override
    public void add(Object element) {
        if (size == 0) {
            first = new Node(element, null, null);
            last = first;
        } else {
            last.next = new Node(element, null, last);
            last = last.next;
        }
        size++;
    }

    @Override
    public Object get(int index) {
        if (index > size)
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds " + size);
        return getNode(index).value;
    }

    @Override
    public void remove(int index) {
        if (index > size)
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds " + size);

        Node cursor = getNode(index);

        if (cursor.prev == null) {
            first = first.next;
            first.prev = null;
        } else if (cursor.next == null) {
            last = last.prev;
            last.next = null;
        } else {
            cursor.prev.next = cursor.next;
            cursor.next.prev = cursor.prev;
        }
        size--;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object value) {
        Node cursor = first;
        for (int i = 0; i < size; i++) {
            if (cursor.value.equals(value)) {
                return true;
            }
            cursor = cursor.next;
        }
        return false;
    }

    @Override
    public void set(int index, Object newValue) {

    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return size;
    }

    private Node getNode(int index) {
        Node cursor = first;
        for (int i = 0; i < index; i++) {
            cursor = cursor.next;
        }
        return cursor;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {

            private Node cursor;

            @Override
            public boolean hasNext() {
                if (cursor != null)
                    return cursor.next != null;
                return first != null;
            }

            @Override
            public Object next() {
                if (cursor == null) {
                    cursor = first;
                    return cursor.value;
                }
                cursor = cursor.next;
                return cursor.value;
            }

        };
    }


    private static class Node {
        Object value;
        Node next;
        Node prev;

        public Node(Object value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }


}
