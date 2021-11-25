package ua.com.alevel.map;

import ua.com.alevel.User;

import java.util.*;

public class MapTest {

    public void test() {
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("www", "www_www");
        hashMap.put("ddd", "ddd_ddd");

        String val = hashMap.get("ddd");
        System.out.println("val = " + val);


        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        // linkedHashMap сохраняет порядок вставки
        hashMap.put(UUID.randomUUID().toString(), "1");
        hashMap.put(UUID.randomUUID().toString(), "3");
        hashMap.put(UUID.randomUUID().toString(), "2");
        hashMap.put(UUID.randomUUID().toString(), "4");
        hashMap.put(UUID.randomUUID().toString(), "7");

        linkedHashMap.put(UUID.randomUUID().toString(), "1");
        linkedHashMap.put(UUID.randomUUID().toString(), "3");
        linkedHashMap.put(UUID.randomUUID().toString(), "2");
        linkedHashMap.put(UUID.randomUUID().toString(), "4");
        linkedHashMap.put(UUID.randomUUID().toString(), "7");

        hashMap.forEach((k, v) -> {
//            System.out.println("k = " + k);
            System.out.println("v = " + v);
        });

        System.out.println();
        linkedHashMap.forEach((k, v) -> {
//            System.out.println("k = " + k);
            System.out.println("v = " + v);
        });

        Map<User, Integer> treeMap = new TreeMap<>();

        User user1 = new User();
        user1.setName("name1");
        user1.setAge(10);

        User user2 = new User();
        user2.setName("name2");
        user2.setAge(10);

        treeMap.put(user1, 1);
        treeMap.put(user2, 2);

        System.out.println();
        treeMap.forEach((k, v) -> {
            System.out.println("k = " + k);
            System.out.println("v = " + v);
        });
    }
}
