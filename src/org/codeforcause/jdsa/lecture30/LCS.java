package org.codeforcause.jdsa.lecture30;

public class LCS {
    public static void main(String[] args) {
        String s1 = "aam";
        String s2 = "alam";
        Integer[][] mem = new Integer[s1.length()+1][s2.length()+1];
        System.out.println(lcs(s1, s2, s1.length(), s2.length()));
        System.out.println(lcsDPItr(s1, s2, mem));
    }

    private static int lcs(String s1, String s2, int l1, int l2) {
        if (l1 == 0 || l2 == 0) {
            return 0;
        }
        if (s1.charAt(l1-1) == s2.charAt(l2-1)) {
            return 1 + lcs(s1, s2, l1-1, l2-1);
        } else {
            int right = lcs(s1, s2, l1, l2-1);
            int left = lcs(s1, s2, l1-1, l2);
            return Math.max(right, left);
        }
    }

    public static int lcsDPItr(String s1, String s2, Integer[][] mem) {
        for (int l1 = 0; l1 <= s1.length(); l1++) {
            for (int l2 = 0; l2 <= s2.length(); l2++) {
                if (l1 == 0 || l2 == 0) {
                    mem[l1][l2] = 0;
                } else if (s1.charAt(l1-1) == s2.charAt(l2-1)) {
                    mem[l1][l2] = 1 + mem[l1-1][l2-1];
                } else {
                    mem[l1][l2] = Math.max(mem[l1][l2-1], mem[l1-1][l2]);
                }
            }
        }
        return mem[s1.length()][s2.length()];
    }
}
