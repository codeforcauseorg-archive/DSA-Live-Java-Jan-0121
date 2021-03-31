package org.codeforcause.jdsa.lecture26;

public class BinaryTree <T extends Comparable<T>> {
    Node root;

    class Node {
        T value;
        Node left;
        Node right;

        Node(T value) {
            this.value = value;
        }

        Node(T value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public void insert(T value, char... dirs) {
        this.root = insert(root, value, dirs, 0);
    }

    private Node insert(Node node, T value, char[] dirs, int index)  {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (dirs.length == index) {
            node.value = value;
            return node;
        }
        if(dirs[index] == 'L') {
            node.left = insert(node.left, value, dirs, index+1);
        } else {
            node.right = insert(node.right, value, dirs, index+1);
        }

        return node;
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        display(node.right, indent+"\t");
        System.out.println(indent + node.value);
        display(node.left, indent+"\t");
    }

    public boolean find(T value) {
        return find(root, value);
    }

    private boolean find(Node node, T value) {
        if (node == null) {
            return false;
        }
        if (node.value.equals(value)) {
            return true;
        }
        return find(node.left, value) || find(node.right, value);
    }

    public T max() {
        return max(root);
    }

    private T max(Node node) {
        if (node == null) {
            return null;
        }
        T max = node.value;
        T left = max(node.left);
        T right = max(node.right);
        if (left != null && max.compareTo(left) < 0) {
            max = left;
        }
        if (right != null && max.compareTo(right) < 0) {
            max = right;
        }
        return max;
    }
}
