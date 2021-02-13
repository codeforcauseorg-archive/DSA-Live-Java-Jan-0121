package org.codeforcause.jdsa.lecture9;

public class ArrayRecursion {
    public static void main(String[] args) {
        int[] nums = {2,5,8,0,1};
        int target = 9;
        System.out.println(linear(nums, target, 0));
    }

    private static int linear(int[] nums, int target, int ind) {
        if (ind == nums.length) {
            return -1;
        }
        if (nums[ind] == target) {
            return ind;
        }
        return linear(nums, target,ind+1);
    }
}
