package org.codeforcause.jdsa.lecture7;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] nums = {8,1,6,4,0};
//        selectionSort(nums);
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    // Selection Sort
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int max = maxIndex(nums,0,nums.length-i);
            swap(nums,max,nums.length-1-i);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    private static int maxIndex(int[] nums, int ind1, int ind2) {
        int max = ind1;
        for (int i = ind1; i < ind2; i++) {
            if(nums[i] > nums[max]) {
                max = i;
            }
        }
        return max;
    }

    //Insertion Sort
    public static void insertionSort(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (nums[j] < nums[j-1]) {
                    swap(nums, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

}
