package edu.ren.datastructure.tree;

public class BSTConversion {
    Integer sum = 0;

    public Node<Integer> convertToGreaterTree(Node<Integer> root) {
        if (root != null) {
            convertToGreaterTree(root.rightChild);
            sum += root.getVal();
            root.setVal(sum);
            convertToGreaterTree(root.leftChild);
        }
        return root;
    }
}
