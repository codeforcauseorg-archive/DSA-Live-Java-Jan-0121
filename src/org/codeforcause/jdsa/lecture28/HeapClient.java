package org.codeforcause.jdsa.lecture28;

import java.util.Arrays;

public class HeapClient {
    public static void main(String[] args) {
        Heap<Integer> heap = new Heap<>();

//        heap.insert(12);
//        heap.insert(1);
//        heap.insert(7);
//        heap.insert(18);
//
//        System.out.println(heap.remove());
//        System.out.println(heap);

        int[] nums = {5,0,1,8,3,9};
        for(int num : nums) {
            heap.insert(num);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = heap.remove();
        }
        System.out.println(Arrays.toString(nums));


    }
}
