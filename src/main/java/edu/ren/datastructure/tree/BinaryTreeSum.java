package edu.ren.datastructure.tree;

public class BinaryTreeSum {

    public static Node<Integer> sumOfTwoTrees(Node<Integer> root1, Node<Integer> root2) {
        if (root1 == null || root2 == null) {
            return root1;
        }

        Node<Integer> resultRoot = new Node(root1.val + root2.val);

        resultRoot.leftChild = sumOfTwoTrees(root1.leftChild, root2.leftChild);
        resultRoot.rightChild = sumOfTwoTrees(root1.rightChild, root2.rightChild);

        return resultRoot;
    }


}
