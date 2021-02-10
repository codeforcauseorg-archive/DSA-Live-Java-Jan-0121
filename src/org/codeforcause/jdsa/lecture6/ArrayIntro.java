package org.codeforcause.jdsa.lecture6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        char[] alphabets = new char[5];
//        for (int i = 0; i < alphabets.length; i++) {
//            alphabets[i] = s.next().charAt(0);
//        }
//
//        System.out.println(Arrays.toString(alphabets));
//        int[] nums = {1,2,3,4,5};
//        System.out.println(Arrays.toString(nums));

        int[] array = {4,7,1,8,3};
        System.out.println(maxValue(array));
    }

    private static int maxValue(int[] nums) {
        int max = Integer.MIN_VALUE;
        System.out.println(max);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
