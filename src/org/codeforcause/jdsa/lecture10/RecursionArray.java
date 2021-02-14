package org.codeforcause.jdsa.lecture10;

public class RecursionArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(isSorted(nums, 0));
    }

    private static boolean isSorted(int[] nums, int ind) {
        if (ind == nums.length-1) {
            return true;
        }
        if (nums[ind] > nums[ind+1]) {
            return false;
        }
        return isSorted(nums, ind+1);
    }
}
