package org.codeforcause.jdsa.lecture23;

public class GenericLinkedList<T extends Comparable<T>> {
    Node head;

    class Node {
        T value;
        Node next;

        Node(T value) {
            this.value = value;
        }

        Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(T value) {
        Node node = new Node(value, head);
        this.head = node;
    }

    public void insertLast(T value) {
        if (this.head == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void insert(T value, int pos) {
        if (pos == 0) {
            insertFirst(value);
            return;
        }
        int cnt = 1;
        Node temp = this.head;
        while (cnt < pos && temp != null) {
            temp = temp.next;
            cnt++;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
    }

    public T deleteFirst() {
        if (this.head == null) {
            return null;
        }
        T temp = this.head.value;
        this.head = this.head.next;
        return temp;
    }

    public T deleteLast() {
        if (this.head == null || this.head.next == null) {
            return deleteFirst();
        }
        Node node = head;
        while (node.next.next != null) {
            node = node.next;
        }
        T temp = node.next.value;
        node.next = null;
        return temp;
    }

    public T delete(int pos) {
        if (pos == 0) {
            return deleteFirst();
        }
        int cnt = 1;
        Node temp = head;
        while (cnt < pos) {
            temp = temp.next;
            cnt++;
        }
        T t = temp.next.value;
        temp.next = temp.next.next;
        return t;
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node ahead;

        while (curr != null){
            ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        this.head = prev;
    }

    public T findMid() {
        if (this.head == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.value;
    }

    public GenericLinkedList<T> merge(GenericLinkedList<T> list) {
        Node h1 = this.head;
        Node h2 = list.head;
        GenericLinkedList<T> result = new GenericLinkedList<>();
        while (h1 != null && h2 != null) {
            if (h1.value.compareTo(h2.value) < 0) {
                result.insertLast(h1.value);
                h1 = h1.next;
            } else {
                result.insertLast(h2.value);
                h2 = h2.next;
            }
        }
        while (h1 != null) {
            result.insertLast(h1.value);
            h1 = h1.next;
        }
        while (h2 != null) {
            result.insertLast(h2.value);
            h2 = h2.next;
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("List: ");
        Node temp = head;
        while (temp.next != null) {
            res.append(temp.value).append(" -> ");
            temp = temp.next;
        }
        res.append(temp.value);
        return res.toString();
    }
}
