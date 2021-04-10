package org.codeforcause.jdsa.lecture30;

public class EditDistance {
    public static void main(String[] args) {
        String s1 = "suman";
        String s2 = "naman";
        Integer[][] mem = new Integer[s1.length()+1][s2.length()+1];
        System.out.println(editDistance(s1, s2, s1.length(), s2.length()));
        System.out.println(editDistanceDP(s1, s2, s1.length(), s2.length(), mem));
        System.out.println(editDistItr(s1, s2, mem));
    }

    private static int editDistance(String s1, String s2, int l1, int l2) {
        if (l1 == 0) {
            return l2;
        }
        if (l2 == 0) {
            return l1;
        }
        if (s1.charAt(l1-1) == s2.charAt(l2-1)) {
            return editDistance(s1, s2, l1-1, l2-1);
        } else {
           int rightRemove = 1 + editDistance(s1, s2, l1, l2-1);
           int leftRemove = 1 + editDistance(s1, s2, l1-1, l2);
           int replace = 1 + editDistance(s1, s2, l1-1, l2-1);
           return Math.min(replace, Math.min(rightRemove, leftRemove));
        }
    }

    private static int editDistanceDP(String s1, String s2, int l1, int l2, Integer[][] mem) {
        if (l1 == 0) {
            return l2;
        }
        if (l2 == 0) {
            return l1;
        }
        if (mem[l1][l2] != null) {
            return mem[l1][l2];
        } else {
            if (s1.charAt(l1 - 1) == s2.charAt(l2 - 1)) {
                mem[l1][l2] = editDistanceDP(s1, s2, l1 - 1, l2 - 1, mem);
            } else {
                int rightRemove = 1 + editDistanceDP(s1, s2, l1, l2 - 1, mem);
                int leftRemove = 1 + editDistanceDP(s1, s2, l1 - 1, l2, mem);
                int replace = 1 + editDistanceDP(s1, s2, l1 - 1, l2 - 1, mem);
                mem[l1][l2] = Math.min(replace, Math.min(rightRemove, leftRemove));
            }
        }
        return mem[l1][l2];
    }

    public static int editDistItr(String s1, String s2, Integer[][] mem) {
        for (int l1 = 0; l1 <= s1.length(); l1++) {
            for (int l2 = 0; l2 <= s2.length(); l2++) {
                if (l1 == 0) {
                    mem[l1][l2] = l2;
                } else if (l2 == 0) {
                    mem[l1][l2] = l1;
                } else {
                    if (s1.charAt(l1-1) == s2.charAt(l2-1)) {
                        mem[l1][l2] = mem[l1-1][l2-1];
                    } else {
                        mem[l1][l2] = 1 + Math.min(mem[l1-1][l2-1],
                                Math.min(mem[l1-1][l2], mem[l1][l2-1]));
                    }
                }
            }
        }
        return mem[s1.length()][s2.length()];
    }
}
