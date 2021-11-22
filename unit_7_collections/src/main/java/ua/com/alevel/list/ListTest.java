package ua.com.alevel.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    private final int size = 100_000;
    private final List<Integer> arrayList = new ArrayList<>(size);
    private final List<Integer> linkedList = new LinkedList<>();
    private final List<Integer> list = new CustomList<>();

    public void run() {
        create();
//        read();
//        update();
        delete();
    }

    private void create() {
        System.out.println("ListTest.create");
        System.out.println("start arrayList");
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis() - start;
        System.out.println("finish arrayList = " + end);

        System.out.println("start linkedList");
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }
        end = System.currentTimeMillis() - start;
        System.out.println("finish linkedList = " + end);
    }

    private void read() {
        System.out.println("ListTest.read");
        System.out.println("start arrayList");
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arrayList.get(i);
        }
        long end = System.currentTimeMillis() - start;
        System.out.println("finish arrayList = " + end);

        System.out.println("start linkedList");
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            linkedList.get(i);
        }
        end = System.currentTimeMillis() - start;
        System.out.println("finish linkedList = " + end);
    }

    private void update() {
        System.out.println("ListTest.update");
        System.out.println("start arrayList");
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, i);
        }
        long end = System.currentTimeMillis() - start;
        System.out.println("finish arrayList = " + end);

        System.out.println("start linkedList");
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            linkedList.set(i, i);
        }
        end = System.currentTimeMillis() - start;
        System.out.println("finish linkedList = " + end);
    }

    private void delete() {
        System.out.println("ListTest.delete");
        Iterator<Integer> arrayListIterator = arrayList.iterator();
        Iterator<Integer> linkedListIterator = linkedList.iterator();
        System.out.println("start arrayList");
        long start = System.currentTimeMillis();
        while (arrayListIterator.hasNext()) {
            arrayListIterator.next();
            arrayListIterator.remove();
        }
        long end = System.currentTimeMillis() - start;
        System.out.println("finish arrayList = " + end);

        System.out.println("start linkedList");
        start = System.currentTimeMillis();
        while (linkedListIterator.hasNext()) {
            linkedListIterator.next();
            linkedListIterator.remove();
        }
        end = System.currentTimeMillis() - start;
        System.out.println("finish linkedList = " + end);
    }
}
