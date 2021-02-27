package org.codeforcause.jdsa.lecture13;

import java.util.Arrays;

public class RotationOfArrays {
    public static void main(String[] args) {
        int[] nums = {3,7,9,5,1,8,0,6,4};
        int k = 3;
        rotateArrayByK(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    private static void rotateArrayByK(int[] nums, int k) {
        int n = nums.length;
        k = (n+k)%n;
        System.out.println(k);
        rotate(nums, 0, n);
        rotate(nums, 0, k);
        rotate(nums, k, n);
    }

    public static void rotate(int[] nums, int start, int end) {
        for (int i = 0; i < (end-start)/2; i++) {
            int t = nums[start+i];
            nums[start+i] = nums[end-i-1];
            nums[end-i-1] = t;
        }
    }
}
