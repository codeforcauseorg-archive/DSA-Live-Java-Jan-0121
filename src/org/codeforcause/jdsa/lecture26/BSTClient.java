package org.codeforcause.jdsa.lecture26;

public class BSTClient {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.insert(23);
        bst.insert(37);
        bst.insert(12);
        bst.insert(87);
        bst.insert(26);
        bst.insert(64);
        bst.insert(16);

//        bst.display();
        System.out.println(bst.find(25));
        System.out.println(bst.max());
        bst.preorder();
        bst.inorder();
        bst.postorder();

    }
}
