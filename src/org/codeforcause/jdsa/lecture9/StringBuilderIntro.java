package org.codeforcause.jdsa.lecture9;

import java.util.Arrays;
import java.util.Scanner;

public class StringBuilderIntro {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        String string = "Ekta";
        StringBuilder stringBuilder = new StringBuilder("Ekta");
//        for (int i = 0; i < 1000000; i++) {
//            string = string + "a";
//        }
//        System.out.println(string);
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append("a");
        }
//        System.out.println(stringBuilder);
//       int n = Integer.parseInt(s.nextLine());
        StringBuilder[] stringBuilders = new StringBuilder[5];
        System.out.println(Arrays.toString(stringBuilders));
        for (int i = 0; i < stringBuilders.length; i++) {
            stringBuilders[i] = new StringBuilder(s.nextLine());
        }
    }
}
