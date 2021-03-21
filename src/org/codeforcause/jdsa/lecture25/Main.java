package org.codeforcause.jdsa.lecture25;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("apple", "red fruit");
        map.put("mango", "red fruit");
        System.out.println(map);
        map.put("apple", "red fruit");
        System.out.println(map);
        System.out.println(map.remove("apple", "hsjdhs"));
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
