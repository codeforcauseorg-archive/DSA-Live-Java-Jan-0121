package org.codeforcause.jdsa.lecture4;

public class Loops {
    public static void main(String[] args) {
        int vals = 6;

        while (vals > 0){
            if(vals%2 == 0){
                vals--;
                continue;
            }
            System.out.println(vals);
            vals--;
        }
    }
}
