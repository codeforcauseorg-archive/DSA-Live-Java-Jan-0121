package org.codeforcause.jdsa.lecture19;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        Parent p = new Child(20, "Ekta");
//        p.scold();
//        System.out.println(p.age + " " + p.name);

        //Stack Implementation check
        CustomStack stack = new CustomStack();
        stack.push(12);
        stack.push(23);
        System.out.println(stack.pop());
        stack.push(56);
        stack.push(71);
        System.out.println(stack.pop());
        stack.push(83);

        System.out.println(stack.peek());

        //Dynamic Stack check
        DynamicStack dynamicStack = new DynamicStack();

        for (int i = 0; i < 100; i++) {
            dynamicStack.push(i);
        }

        System.out.println(dynamicStack.peek());

    }
}
