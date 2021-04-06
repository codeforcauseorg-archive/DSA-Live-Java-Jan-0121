package org.codeforcause.jdsa.lecture29;

public class DiceProblem {
    public static void main(String[] args) {
        int faces = 6;
        int target = 4;
        System.out.println(dice(faces, target));
    }

    private static int dice(int faces, int target) {
        if (target == 0) {
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= Math.min(target, faces); i++) {
            count += dice(faces, target-i);
        }
        return count;
    }

    public static int diceDP(int faces, int target, Integer[] mem) {
        if (target == 0) {
            return 1;
        }
        if (mem[target] != null) {
            return mem[target];
        }
        int count = 0;
        for (int i = 1; i <= Math.min(target, faces); i++) {
            count += diceDP(faces, target-i, mem);
        }
        mem[target] = count;
        return count;
    }

    public static int diceDPitr(int faces, int target, Integer[] mem) {
        for (int t = 0; t <= target; t++) {
            if (t == 0) {
                mem[t] = 1;
            } else {
                int count = 0;
                for (int i = 1; i <= Math.min(t, faces); i++) {
                    count += mem[t-i];
                }
                mem[t] = count;
            }
        }
        return mem[target];
    }
}
