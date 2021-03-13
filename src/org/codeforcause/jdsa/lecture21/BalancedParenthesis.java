package org.codeforcause.jdsa.lecture21;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String str = "{{{}}()}";
        System.out.println(balancedParenthesis(str));
    }

    private static boolean balancedParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else {
                char open = openBraces(ch);
                if(open != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static char openBraces(char ch) {
        if (ch == '}') {
            return '{';
        } else if(ch == ']') {
            return '[';
        } else {
            return '(';
        }
    }
}
