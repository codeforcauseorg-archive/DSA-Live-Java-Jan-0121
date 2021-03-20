package org.codeforcause.jdsa.lecture24;

import java.util.ArrayList;

public class CustomSetArray<K> {
    ArrayList<K> data;
    int size = 20;

    public CustomSetArray() {
        this.data = new ArrayList<>();
    }

    public void add(K value) {
        int hash = value.hashCode();
        int index = hash % size;
        if (data.get(index) == null) {
            data.add(index, value);
        }
    }
}
