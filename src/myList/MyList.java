package myList;

public interface MyList<T> extends Iterable{

    void add(T i);

    T get(int index);

    void remove(int index);

    boolean isEmpty();

    boolean contains(T value);

    void set(int index, T newValue);

    void clear();

    int size();
}
