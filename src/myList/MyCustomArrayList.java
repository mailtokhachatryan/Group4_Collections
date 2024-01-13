package myList;

import java.util.Arrays;
import java.util.Iterator;

public class MyCustomArrayList<T> implements MyList<T> {

    private Object[] elements;
    private int size;

    public MyCustomArrayList() {
        elements = new Object[10];
    }

    @Override
    public void add(T i) {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size] = i;
        size++;
    }

    @Override
    public T get(int index) {
        return (T) elements[index];
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < size; i++) {
            if (i != elements.length - 1)
                elements[i] = elements[i + 1];
            else
                elements[i] = 0;
        }
        size--;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T value) {
        for (int i = 0; i < elements.length; i++) {
            if (value == elements[i])
                return true;
        }
        return false;
    }

    @Override
    public void set(int index, T newValue) {
        elements[index] = newValue;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public String toString() {

        String result = "[";

        for (int i = 0; i < size - 1; i++) {
            result = result + elements[i] + ", ";
        }

        result = result + elements[size - 1] + "]";

        return result;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
