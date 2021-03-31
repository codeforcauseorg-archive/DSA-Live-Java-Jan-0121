package org.codeforcause.jdsa.lecture26;

public class TreeClient {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.insert(2);
        tree.insert(5, 'L');
        tree.insert(9, 'R');
        tree.insert(0, 'L', 'L');
        tree.insert(7, 'L', 'R');
        tree.insert(3, 'R', 'R');
        tree.insert(-1, 'L', 'R');
        tree.display();

        System.out.println(tree.find(0));
        System.out.println(tree.max());
    }
}
