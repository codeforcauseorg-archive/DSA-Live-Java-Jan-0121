package org.codeforcause.jdsa.lecture16;

public class SumKSubArray {
    public static void main(String[] args) {
        int[] nums = {9,0,-1,3,-2,8};
        int k = 3;
        sumKSubArray(nums,k);
    }

    private static void sumKSubArray(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int cnt = 1;
        System.out.println("Sum" + cnt++ + " :" + sum);
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i-k] + nums[i];
            System.out.println("Sum" + cnt++ + " :" + sum);
        }
    }
}
