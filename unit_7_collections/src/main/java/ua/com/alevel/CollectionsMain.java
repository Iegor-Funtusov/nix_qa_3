package ua.com.alevel;

import ua.com.alevel.list.ListTest;

import java.util.*;

public class CollectionsMain {

    public static void main(String[] args) {
        System.out.println("CollectionsMain.main");

        Collection collection;
        Map map;

//        collection
        List list;
        Set set;
        Queue queue;

//        list
        ArrayList arrayList;
        LinkedList linkedList;

//        set
        HashSet hashSet;
        LinkedHashSet linkedHashSet;
        TreeSet treeSet;

//        queue
        ArrayDeque arrayDeque;
        LinkedList linkedList1;

        // map
        HashMap hashMap;
        LinkedHashMap linkedHashMap;
        TreeMap treeMap;



        for (int i = 0; i < 20; i++) {
            new ListTest().run();
        }

    }
}
