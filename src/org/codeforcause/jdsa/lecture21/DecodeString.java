package org.codeforcause.jdsa.lecture21;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String string = "2[abc]3[cd]ef";
        System.out.println(decodeString(string));
    }

    public static String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        int idx = 0;
        while (idx < s.length()) {
            if (Character.isDigit(s.charAt(idx))) {
                int count = 0;
                while (Character.isDigit(s.charAt(idx))) {
                    count = 10 * count + (s.charAt(idx) - '0');
                    idx++;
                }
                countStack.push(count);
            }
            else if (s.charAt(idx) == '[') {
                resStack.push(res.toString());
                res = new StringBuilder();
                idx++;
            }
            else if (s.charAt(idx) == ']') {
                StringBuilder temp = new StringBuilder (resStack.pop());
                int repeatTimes = countStack.pop();
                temp.append(res.toString().repeat(Math.max(0, repeatTimes)));
                res = new StringBuilder(temp.toString());
                idx++;
            }
            else {
                res.append(s.charAt(idx++));
            }
        }
        return res.toString();
    }
}
