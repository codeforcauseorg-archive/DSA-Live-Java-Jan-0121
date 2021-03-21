package org.codeforcause.jdsa.lecture25;

import java.util.*;

public class CustomHashMap<K, V> {
    class Pair {
        K key;
        V value;

        Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    ArrayList<LinkedList<Pair>> data;
    private static final int DEFAULT_SIZE = 20;
    int size;
    static final double load_factor = 0.75;

    CustomHashMap() {
        this.data = new ArrayList<>();
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            this.data.add(new LinkedList<>());
        }
        this.size = 0;
    }

    public void put(K key, V value) {
        int hash = key.hashCode();
        int index = Math.abs(hash % this.data.size());
        LinkedList<Pair> list = this.data.get(index);
        for(Pair pair : list) {
            if (pair.key.equals(key)) {
                pair.value = value;
                return;
            }
        }
        list.add(new Pair(key, value));
        this.size++;
        if ((double)this.size/this.data.size() > load_factor) {
            rehash();
        }
    }

    private void rehash() {

    }

    public V get(K key) {
        int hash = key.hashCode();
        int index = Math.abs(hash % this.data.size());
        LinkedList<Pair> list = this.data.get(index);
        for(Pair pair : list) {
            if (pair.key.equals(key)) {
                return pair.value;
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        int hash = key.hashCode();
        int index = Math.abs(hash % this.data.size());
        LinkedList<Pair> list = this.data.get(index);
        for(Pair pair : list) {
            if (pair.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public V remove(K key) {
        int hash = key.hashCode();
        int index = Math.abs(hash % this.data.size());
        LinkedList<Pair> list = this.data.get(index);
        for(Pair pair : list) {
            if (pair.key.equals(key)) {
                list.remove(pair);
                this.size--;
                return pair.value;
            }
        }
        return null;
    }

    public boolean remove(K key, V value) {
        int hash = key.hashCode();
        int index = Math.abs(hash % this.data.size());
        LinkedList<Pair> list = this.data.get(index);
        for(Pair pair : list) {
            if (pair.key.equals(key) && pair.value.equals(value)) {
                list.remove(pair);
                this.size--;
                return true;
            }
        }
        return false;
    }

    public Set<K> keySet() {
        Set<K> keys = new HashSet<>();
        for(LinkedList<Pair> list : this.data) {
            for (Pair pair : list) {
                keys.add(pair.key);
            }
        }
        return keys;
    }

    public Collection<V> values() {
        Collection<V> values = new HashSet<>();
        for(LinkedList<Pair> list : this.data) {
            for (Pair pair : list) {
                values.add(pair.value);
            }
        }
        return values;
    }
}
