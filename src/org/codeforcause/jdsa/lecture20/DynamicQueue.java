package org.codeforcause.jdsa.lecture20;

public class DynamicQueue extends CircularQueue {
    @Override
    public void enqueue(int value) {
        if (isFull()) {
            Integer[] temp = new Integer[this.data.length*2];
            for (int i = 0; i < size; i++) {
                temp[i] = this.data[(front+i) % size];
            }
            this.front = 0;
            this.end = size-1;
            this.data = temp;
        }
        super.enqueue(value);
    }
}
