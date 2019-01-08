package edu.ren.datastructure.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    public void printPathRec(Node<Integer> root){
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        printPath(root, list);
    }

    private void printPath(Node<Integer> root, List<Integer> list) {

        if (root.leftChild != null) {
            list.add(root.leftChild.val);
            printPath(root.leftChild, list);
            list.remove(list.size()-1);
        }
        if (root.rightChild != null) {
            list.add(root.rightChild.val);
            printPath(root.rightChild, list);
            list.remove(list.size()-1);
        }

        if (root.leftChild == null && root.rightChild == null)
            System.out.println(list);

    }

    public void printSum(Node<Integer> root){
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        printPathSum(root, list);
    }
    private void printPathSum(Node<Integer> root, List<Integer> list) {

        if (root.leftChild != null) {
            list.add(root.leftChild.val);
            printPathSum(root.leftChild, list);
            list.remove(list.size()-1);
        }
        if (root.rightChild != null) {
            list.add(root.rightChild.val);
            printPathSum(root.rightChild, list);
            list.remove(list.size()-1);
        }

        if (root.leftChild == null && root.rightChild == null) {
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum+=list.get(i);
            }
            System.out.println(sum);
        }

    }
}
