package org.codeforcause.jdsa.lecture22;

public class CustomLinkedList {
    Node head;

    class Node {
        Integer value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value) {
        Node node = new Node(value, head);
        this.head = node;
    }

    public void insertLast(int value) {
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

    public void insert(int value, int pos) {
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

    public Integer deleteFirst() {
        if (this.head == null) {
            return null;
        }
        int temp = this.head.value;
        this.head = this.head.next;
        return temp;
    }

    public Integer deleteLast() {
        if (this.head == null || this.head.next == null) {
            return deleteFirst();
        }
        Node node = head;
        while (node.next.next != null) {
            node = node.next;
        }
        int temp = node.next.value;
        node.next = null;
        return temp;
    }

    public Integer delete(int pos) {
        if (pos == 0) {
            return deleteFirst();
        }
        int cnt = 1;
        Node temp = head;
        while (cnt < pos) {
            temp = temp.next;
            cnt++;
        }
        int t = temp.next.value;
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

    public Integer findMid() {
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
