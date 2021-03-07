package org.codeforcause.jdsa.lecture19;

public class CustomStack {
    protected Integer[] data;
    private int top;
    private static final int DEFAULT_SIZE = 10;

    CustomStack() {
        this.data = new Integer[DEFAULT_SIZE];
        this.top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow!!");
            return;
        }
        this.data[++top] = value;
    }

    protected boolean isFull() {
        return this.top == data.length-1;
    }

    public Integer pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!!");
            return null;
        }
        return this.data[top--];
    }

    private boolean isEmpty() {
        return this.top == -1;
    }

    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!!");
            return null;
        }
        return this.data[top];
    }
}
