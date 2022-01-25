package edu.ren.datastructure.tree;

public class ViewOfTree {

    void printLeftView(Node root) {
        if (root == null)
            return;
        System.out.print(root.getVal() + ",");
        printLeftView(root.leftChild);
    }

    public void printRightView(Node<Integer> root) {
        if (root == null)
            return;
        System.out.print(root.getVal() + ",");
        printLeftView(root.rightChild);

    }
}
