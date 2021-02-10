package org.codeforcause.jdsa.lecture5;

public class PassConcept {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        System.out.println(a + " : " + b);
        swap(a,b);
        System.out.println(a + " : " + b);

        int[] nums = new int[2];
        nums[0] = 3;
        nums[1] = 7;
        swapArr(nums);
        System.out.println(nums[0] +" : " + nums[1]);
    }

    private static void swapArr(int[] nums) {
        int t = nums[0];
        nums[0] = nums[1];
        nums[1] = t;
    }

    private static void swap(int a, int b) {
        int t = a;
        a = b;
        b = t;
    }
}
