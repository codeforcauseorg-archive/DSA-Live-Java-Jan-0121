package org.codeforcause.jdsa.lecture30;

public class EggDrop {
    public static void main(String[] args) {
        int floors = 20;
        int eggs = 3;
        Integer[][] mem = new Integer[floors+1][eggs+1];
        System.out.println(eggDrop(floors, eggs));
        System.out.println(eggDropItr(floors, eggs, mem));
    }

    private static int eggDrop(int floors, int eggs) {
        if (eggs == 1) {
            return floors;
        }
        if (floors == 0) {
            return 0;
        }
        int best = floors;
        for (int f = 1; f <= floors; f++) {
            int broken = eggDrop(f-1, eggs-1);
            int safe = eggDrop(floors-f, eggs);
            int max = 1 + Math.max(broken, safe);

            if (max < best) {
                best = max;
            }
        }
        return best;
    }

    public static int eggDropItr(int floors, int eggs, Integer[][] mem) {
        for (int f = 0; f <= floors; f++) {
            for (int e = 1; e <= eggs; e++) {
                if (e == 1) {
                    mem[f][e] = f;
                } else if (f == 0) {
                    mem[f][e] = 0;
                } else {
                    mem[f][e] = f;
                    for (int i = 1; i <= f; i++) {
                        int max = 1 + Math.max(mem[i - 1][e - 1], mem[f - i][e]);
                        if (max < mem[f][e]) {
                            mem[f][e] = max;
                        }
                    }
                }
            }
        }
        return mem[floors][eggs];
    }
}
