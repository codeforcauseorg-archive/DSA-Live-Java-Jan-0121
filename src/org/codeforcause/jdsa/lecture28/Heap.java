package org.codeforcause.jdsa.lecture28;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    ArrayList<T> list;

    Heap() {
        this.list = new ArrayList<>();
    }

    private int leftCI(int parent) {
        return 2*parent+1;
    }

    private int rightCI(int parent) {
        return 2*parent+2;
    }

    private int parentInd(int child) {
        return (child-1)/2;
    }

    public void insert(T value) {
        list.add(value);
        upHeapify(list.size()-1);
    }

    private void upHeapify(int index) {
        if (index == 0) {
            return;
        }
        int parent = parentInd(index);
        if (list.get(parent).compareTo(list.get(index)) <= 0) {
            return;
        }
        T temp = list.get(index);
        list.set(index, list.get(parent));
        list.set(parent, temp);
        upHeapify(parent);
    }

    public T remove() {
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return list.remove(0);
        }
        T value = list.get(0);
        list.set(0, list.remove(list.size()-1));
        downHeapify(0);
        return value;
    }

    private void downHeapify(int index) {
        int min = index;
        int left = leftCI(index);
        int right = rightCI(index);
        if (left < list.size() && list.get(left).compareTo(list.get(min)) < 0) {
            min = left;
        }
        if (right < list.size() && list.get(right).compareTo(list.get(min)) < 0) {
            min = right;
        }
        if (min != index) {
            T temp = list.get(index);
            list.set(index, list.get(min));
            list.set(min, temp);
            downHeapify(min);
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
