package org.codeforcause.jdsa.lecture27;

import java.util.ArrayList;
import java.util.List;

public class AVLTree<T extends Comparable<T>> {
    Node root;

    class Node {
        T value;
        Node left;
        Node right;
        int height;

        Node(T value) {
            this.value = value;
            this.height = 1;
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
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        node = balancing(node);
        return node;
    }

    private Node balancing(Node node) {
        if (height(node.right) - height(node.left) > 1) {
            if (height(node.right.left) - height(node.right.right) > 0) {
                node.right = rightRotate(node.right);
            }
            node = leftRotate(node);
        }

        if (height(node.left) - height(node.right) > 1) {
            if (height(node.left.right) - height(node.left.left) > 0) {
                node.left = leftRotate(node.left);
            }
            node = rightRotate(node);
        }
        return node;
    }

    private Node rightRotate(Node x) {
        Node y = x.left;
        Node T = y.right;

        y.right = x;
        x.left = T;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return y;

        /*
         x
        /
       y
        \
         T
         */
    }

    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T = y.left;

        y.left = x;
        x.right = T;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return y;

        /*
         x
          \
           y
          /
        T
         */
    }

    public int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
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
}
