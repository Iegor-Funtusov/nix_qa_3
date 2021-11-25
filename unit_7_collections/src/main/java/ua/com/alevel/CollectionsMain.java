package ua.com.alevel;

import ua.com.alevel.list.ListTest;
import ua.com.alevel.map.MapTest;

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



//        for (int i = 0; i < 20; i++) {
//            new ListTest().run();
//        }

        new MapTest().test();

//        User user1 = new User();
//        user1.setName("name");
//        user1.setAge(10);
//
//        User user2 = new User();
//        user2.setName("name");
//        user2.setAge(10);


//        long hash = 10;
//
//        String name = user1.getName();
//        StringBuilder charResult = new StringBuilder();
//        char[] chars = name.toCharArray();
//        for (char aChar : chars) {
//            int aChar1 = aChar;
//            charResult.append(aChar1);
//        }
//        System.out.println("charResult = " + charResult);
//
//        hash = Long.parseLong(charResult.toString()) * user1.getAge();
//        System.out.println("hash = " + hash);

//        System.out.println(true && true); // true
//        System.out.println(true && false); // false
//        System.out.println(true || true); // true
//        System.out.println(true || false); // true
//        System.out.println(false || false); // false

//        System.out.println(user1.hashCode());
//        System.out.println(user2.hashCode());
//        System.out.println(user1.equals(user2));
//
//        System.out.println(6 & 4);


    }
}
