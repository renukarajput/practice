package edu.leetcode.tree;

import edu.ren.datastructure.interviewBit.tree.BinaryTree;
import edu.ren.datastructure.interviewBit.tree.BinaryTreePrinter;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MostFrequentSubTreeSumTest {
    MostFrequentSubTreeSum mostFrequentSubTreeSum=new MostFrequentSubTreeSum();

    @Test
    public void findFrequentTreeSum() {
        BinaryTree tree = BinaryTree.buildFromLevelOrder(new int[]{5, 2, -3});
        BinaryTreePrinter.printNode(tree.getRoot());
        int[] sums = mostFrequentSubTreeSum.findFrequentTreeSum(tree.getRoot());
        System.out.println(Arrays.toString(sums));
    }
}