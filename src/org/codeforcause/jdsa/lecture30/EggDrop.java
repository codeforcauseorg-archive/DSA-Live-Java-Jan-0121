package org.codeforcause.jdsa.lecture30;

public class EggDrop {
    public static void main(String[] args) {
        int floors = 25;
        int eggs = 2;
        Integer[][] mem = new Integer[floors+1][eggs+1];
        System.out.println(eggDrop(floors, eggs));
        System.out.println(eggDropDP(floors, eggs, mem));
        System.out.println(eggDropItr(floors, eggs, mem));
    }

    private static int eggDrop(int floors, int eggs) {
        if (eggs == 1) {
            return floors;
        }
        if (floors < 2) {
            return floors;
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

    private static int eggDropDP(int floors, int eggs, Integer[][] mem) {
        if (eggs == 1) {
            return floors;
        }
        if (floors < 2) {
            return floors;
        }
        if (mem[floors][eggs] != null) {
            return mem[floors][eggs];
        } else {
            mem[floors][eggs] = floors;
            for (int f = 1; f <= floors; f++) {
                int broken = eggDropDP(f - 1, eggs - 1, mem);
                int safe = eggDropDP(floors - f, eggs, mem);
                int max = 1 + Math.max(broken, safe);

                if (max < mem[floors][eggs]) {
                    mem[floors][eggs] = max;
                }
            }
        }
        return mem[floors][eggs];
    }

    public static int eggDropItr(int floors, int eggs, Integer[][] mem) {
        for (int f = 0; f <= floors; f++) {
            for (int e = 1; e <= eggs; e++) {
                if (e == 1) {
                    mem[f][e] = f;
                } else if (f < 2) {
                    mem[f][e] = f;
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
