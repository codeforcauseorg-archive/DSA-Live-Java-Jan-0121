package org.codeforcause.jdsa.lecture16;

import java.util.ArrayList;

public class MaxMinKSubarray {
    public static void main(String[] args) {
        int[] nums = {2,5,-1,7,-3,-1,-2};
        int k = 4;
        int sum = maxMinSubArrayK(nums, k);
        System.out.println(sum);
    }

    private static int maxMinSubArrayK(int[] nums, int k) {
        ArrayList<Integer> maxInd = new ArrayList<>();
        ArrayList<Integer> minInd = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            while (!maxInd.isEmpty() && nums[maxInd.get(0)] <= nums[i]) {
                maxInd.remove(0);
            }
            while (!minInd.isEmpty() && nums[minInd.get(0)] >= nums[i]) {
                minInd.remove(0);
            }
            maxInd.add(i);
            minInd.add(i);
        }
        for (int i = k; i < nums.length; i++) {
            System.out.println("Max: " + nums[maxInd.get(0)] + " Min: " + nums[minInd.get(0)]);
            sum = sum + nums[maxInd.get(0)] + nums[minInd.get(0)];
            // elements which are not in the current window
            if (!maxInd.isEmpty() && maxInd.get(0) <= i-k) {
                maxInd.remove(0);
            }
            if (!minInd.isEmpty() && minInd.get(0) <= i-k) {
                minInd.remove(0);
            }
            // unuseful elements
            while (!maxInd.isEmpty() && nums[maxInd.get(0)] <= nums[i]) {
                maxInd.remove(0);
            }
            while (!minInd.isEmpty() && nums[minInd.get(0)] >= nums[i]) {
                minInd.remove(0);
            }
            maxInd.add(i);
            minInd.add(i);
        }
        System.out.println("Max: " + nums[maxInd.get(0)] + " Min: " + nums[minInd.get(0)]);
        sum = sum + nums[maxInd.get(0)] + nums[minInd.get(0)];
        return sum;
    }
}
