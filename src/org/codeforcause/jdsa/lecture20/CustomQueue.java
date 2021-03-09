package org.codeforcause.jdsa.lecture20;

import java.util.Arrays;

public class CustomQueue {
    private Integer[] data;
    private int end;
    private static final int DEFAULT_SIZE = 10;

    CustomQueue(int size) {
        this.data = new Integer[size];
        this.end = -1;
    }

    CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue overflow!!");
            return;
        }
        this.data[++end] = value;
    }

    private boolean isFull() {
        return this.end == this.data.length-1;
    }

    public Integer dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!");
            return null;
        }
        int temp = this.data[0];
        for (int i = 0; i < end; i++) {
            this.data[i] = this.data[i+1];
        }
        this.end--;
        return temp;
    }

    private boolean isEmpty() {
        return this.end == -1;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Queue: ");
        for (int i = 0; i <= end; i++) {
            str.append(this.data[i]).append(" ");
        }
        return str.toString();
    }
}
