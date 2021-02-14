package org.codeforcause.jdsa.lecture10;

public class StringRecursion {
    public static void main(String[] args) {
        String str ="abc";
//        subsequence("",str);
        permutations("", str);
    }

    private static void permutations(String proc, String unproc) {
        if (unproc.isEmpty()) {
            System.out.println(proc);
            return;
        }

        char ch = unproc.charAt(0);
        unproc = unproc.substring(1);
        for (int i = 0; i <= proc.length(); i++) {
            String first = proc.substring(0,i);
            String second = proc.substring(i);
            permutations(first+ch+second, unproc);
        }
    }

    private static void subsequence(String proc, String unproc) {
        if (unproc.isEmpty()) {
            System.out.println(proc);
            return;
        }
        char ch = unproc.charAt(0);
        unproc = unproc.substring(1);

        subsequence(proc,unproc);
        subsequence(proc+ch,unproc);
    }
}
