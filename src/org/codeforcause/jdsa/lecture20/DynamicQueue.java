package org.codeforcause.jdsa.lecture20;

public class DynamicQueue extends CircularQueue {
    @Override
    public void enqueue(int value) {
        if (isFull()) {

        }
        super.enqueue(value);
    }
}
