package org.codeforcause.jdsa.lecture21;

import java.util.*;

public class TheSaviours {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            String str = s.next();
            Stack<Character> stack = new Stack<>();
            for(int i = str.length()-1;i>=0;i--){
                char ch = str.charAt(i);
                if(ch == '0'){
                    stack.push(ch);
                }else{
                    for(int j = 0;j<2;j++){
                        if(!stack.isEmpty()){
                            stack.pop();
                        }else{
                            break;
                        }
                    }
                }
            }
            System.out.println(stack.isEmpty() ? "YES" : "NO");
        }
    }
}
