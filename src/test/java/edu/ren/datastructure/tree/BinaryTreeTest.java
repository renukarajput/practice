package edu.ren.datastructure.tree;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 1/30/18.
 */
public class BinaryTreeTest {

    @Test
    public void testInsert(){
        BinaryTree<Integer> binaryTree=new BinaryTree<>();
        binaryTree.insert(20);
        binaryTree.insert(10);
        binaryTree.insert(30);
        binaryTree.insert(40);
        binaryTree.insert(50);
        List<Integer> preOrder = binaryTree.preOrderValues();
        System.out.print(preOrder);
        System.out.println("\n");
        BinaryTreePrinter.printNode(binaryTree.root);
    }

    @Test
    public void testInsertBroken(){
        BinaryTree<Integer> binaryTree=new BinaryTree<>();
        binaryTree.insertInBinaryTreee(20);
        binaryTree.insertInBinaryTreee(10);
        binaryTree.insert(30);
        binaryTree.insertInBinaryTreee(40);
        binaryTree.insertInBinaryTreee(50);
        List<Integer> preOrder = binaryTree.preOrderValues();
        System.out.print(preOrder);
        System.out.println("\n");
        BinaryTreePrinter.printNode(binaryTree.root);
    }
}