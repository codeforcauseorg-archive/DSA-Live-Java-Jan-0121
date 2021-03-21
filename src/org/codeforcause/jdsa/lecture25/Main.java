package org.codeforcause.jdsa.lecture25;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("apple", "red fruit");
//        map.put("mango", "red fruit");
//        System.out.println(map);
//        map.put("apple", "red fruit");
//        System.out.println(map);
//        System.out.println(map.remove("apple", "hsjdhs"));
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//
//        CustomHashMap<String, String> customMap = new CustomHashMap<>();
//        customMap.put("apple", "red fruit");
//        customMap.put("mango", "red fruit");
//        System.out.println(customMap);
//        customMap.put("apple", "red fruit");
//        System.out.println(customMap);
//        System.out.println(customMap.remove("apple", "hsjdhs"));
//        System.out.println(customMap.keySet());
//        System.out.println(customMap.values());

        String str = "Hello World!!";
        System.out.println(freq(str));
    }

    private static HashMap<Character, Integer> freq(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }
}
