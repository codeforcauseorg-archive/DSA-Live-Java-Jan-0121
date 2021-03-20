package org.codeforcause.jdsa.lecture24;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        HashSet<String> set  = new HashSet<>();
//        set.add("Ekta");
//        set.add("Ekta");
//        set.add("Anuprita");
//        set.add("Neha");
//        set.add("Ekta");
//
//        System.out.println(set);
//
//        System.out.println(set.contains("Neha"));
//        set.remove("Neha");
//
//        System.out.println(set);

//        String str = "banana";
//        System.out.println(str.hashCode());

        //CustomSet check
        CustomSet<String> customSet = new CustomSet<>();
        customSet.add("Ekta");
        customSet.add("Ekta");
        customSet.add("Neha");
        customSet.add("Surbhi");
        customSet.add("Ekta");
        customSet.add("Ekta");

        System.out.println(customSet);
        customSet.remove("Ekta");
        System.out.println(customSet);
        System.out.println(customSet.contains("Ekta"));
    }
}
