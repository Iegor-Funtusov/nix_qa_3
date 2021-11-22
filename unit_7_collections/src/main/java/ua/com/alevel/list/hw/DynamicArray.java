package ua.com.alevel.list.hw;

public interface DynamicArray {

    void add(Object o);
    Object get(int i);
    void set(int i, Object o);
    void delete(int i);
    Object[] find();
}
