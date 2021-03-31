package org.codeforcause.jdsa.lecture26;

public class BinarySearchTree<T extends Comparable<T>> {
    Node root;
    class Node {
        T value;
        Node left;
        Node right;

        Node(T value) {
            this.value = value;
        }
    }

    public void insert(T value) {
        this.root = insert(root, value);
    }

    private Node insert(Node node, T value) {
        if (node == null) {
            return new Node(value);
        }

        if (node.value.compareTo(value) < 0) {
            node.right = insert(node.right, value);
        }
        if (node.value.compareTo(value) > 0) {
            node.left = insert(node.left, value);
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
        if (node.value.compareTo(value) < 0) {
            return find(node.right, value);
        }
        if (node.value.compareTo(value) > 0) {
            return find(node.left, value);
        }
        return false;
    }

    public T max() {
        return max(root);
    }

    private T max(Node node) {
        if (node.right == null) {
            return node.value;
        }
        return max(node.right);
    }

    public T min() {
        return max(root);
    }

    private T min(Node node) {
        if (node.left == null) {
            return node.value;
        }
        return min(node.left);
    }

    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }

    public void preorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void postorder() {
        postorder(root);
        System.out.println();
    }

    private void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }
}
