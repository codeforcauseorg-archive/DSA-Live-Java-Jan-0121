package org.codeforcause.jdsa.lecture20;

public class CircularQueue {
    protected Integer[] data;
    private int front;
    private int end;
    private int size;
    private static final int DEFAULT_SIZE = 10;

    CircularQueue(int size) {
        this.data = new Integer[size];
        this.end = -1;
        this.front = 0;
        this.size = 0;
    }

    CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue overflow!!");
            return;
        }
        this.end = (this.end+1) % this.data.length;
        this.data[this.end] = value;
        this.size++;
    }

    protected boolean isFull() {
        return this.size == this.data.length;
    }

    public Integer dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!");
            return null;
        }
        int temp = this.data[this.front];
        this.front = (this.front+1) % this.data.length;
        this.size--;
        return temp;
    }

    private boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Queue: ");
        for (int i = 0; i < size; i++) {
            str.append(this.data[(front+i)%data.length]).append(" ");
        }
        return str.toString();
    }
}
