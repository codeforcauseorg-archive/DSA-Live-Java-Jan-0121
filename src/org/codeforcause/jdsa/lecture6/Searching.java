package org.codeforcause.jdsa.lecture6;

import java.util.Arrays;

public class Searching {
    public static void main(String[] args) {
        int[] nums = {10,2,6,8,13,2,6,8,26};
        System.out.println(linearSearch(nums, 8));
        System.out.println(binarySearch(nums, 6));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

    }

    private static int linearSearch(int[] nums, int elt) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == elt) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int elt) {
        int start = 0, end = nums.length-1, mid;
        while (start <= end) {
            mid = (start+end) / 2;
            if(nums[mid] == elt) {
                return mid;
            } else if(nums[mid] < elt) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
