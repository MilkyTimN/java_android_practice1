package hw10;

import java.util.ArrayList;
import java.util.HashMap;

public class Contacts {
    private HashMap <String, ArrayList<String>> map = new HashMap<>();

    public void add(String surname, String phoneNum) {
        ArrayList<String> num = map.getOrDefault(surname, new ArrayList<>());
        num.add(phoneNum);
        map.put(surname, num);
    }

    public void get(String surname) {
        System.out.println(map.get(surname));
    }
}
