package hw10;

import java.util.*;

public class Main {
    public static void main(String[] args) {

// EX1
        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Cherry", "Melon", "Banana", "Banana", "Apple", "Melon"));
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);

        }
        System.out.println(map);

// EX2
        Contacts contacts = new Contacts();
        contacts.add("Tim", "555");
        contacts.add("Tim", "111");
        contacts.add("Kek", "222");

        contacts.get("Tim");
        contacts.get("Kek");
    }
}