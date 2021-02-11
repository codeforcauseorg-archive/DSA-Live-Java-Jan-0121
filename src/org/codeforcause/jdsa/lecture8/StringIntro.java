package org.codeforcause.jdsa.lecture8;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = "Ekta";
        String s2 = "Ekta";
        //Big NO for comparison
//        if (s1 == s2) {
//            System.out.println("hey!!");
//        }
//        if (s1.equals(s2)) {
//            System.out.println("hey!!");
//        }
        String str = s.next();
//        s.nextLine();
//        String st1 = s.nextLine();
        System.out.println(str);
//        System.out.println(st1);
//        System.out.println(str.substring(4));
        System.out.println(str.indexOf("sh"));
    }
}
