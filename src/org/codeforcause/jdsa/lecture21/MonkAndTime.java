package org.codeforcause.jdsa.lecture21;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MonkAndTime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Queue<Integer> calling = new LinkedList<>();
        Queue<Integer> ideal = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            calling.add(s.nextInt());
        }

        for (int i = 0; i < n; i++) {
            ideal.add(s.nextInt());
        }

        int cnt = 0;
        while(!calling.isEmpty()) {
            if(calling.peek() == ideal.peek()) {
                calling.remove();
                ideal.remove();
            } else {
                int temp = calling.remove();
                calling.add(temp);
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
