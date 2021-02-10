package com.company.lecture2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
//        System.out.println(year);
        if (year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
