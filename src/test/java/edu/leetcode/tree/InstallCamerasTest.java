package edu.leetcode.tree;

import edu.ren.datastructure.interviewBit.tree.BinaryTree;
import edu.ren.datastructure.interviewBit.tree.BinaryTreePrinter;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class InstallCamerasTest {
    InstallCameras installCameras = new InstallCameras();

    @Test
    public void minCameraCover() {
        BinaryTree tree = BinaryTree.buildFromLevelOrder(new int[]{0, 0, 0, 0, -1, 0, -1, -1, 0});
        BinaryTreePrinter.printNode(tree.getRoot());
        assertThat(installCameras.minCameraCover(tree.getRoot()), is(2));
    }

    @Test
    public void minCameraCover_1() {
        BinaryTree tree = BinaryTree.buildFromLevelOrder(new int[]{1, 2, -1, 3, -1, 4, -1, -1, 5});
        BinaryTreePrinter.printNode(tree.getRoot());
        assertThat(installCameras.minCameraCover(tree.getRoot()), is(2));
    }

    @Test
    public void minCameraCover_2() {
        //[0,0,null,null,0,0,null,null,0,0]
        BinaryTree tree = BinaryTree.buildFromLevelOrder(new int[]{1, 2, -1, -1, 3, 4, -1, -1, 5, 6});
        BinaryTreePrinter.printNode(tree.getRoot());
        assertThat(installCameras.minCameraCover(tree.getRoot()), is(2));
    }

    @Test
    public void minCameraCover01() {
        BinaryTree tree = BinaryTree.buildFromLevelOrder(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0});
        BinaryTreePrinter.printNode(tree.getRoot());
        assertThat(installCameras.minCameraCover(tree.getRoot()), is(3));
    }

    @Test
    public void minCameraCover02() {
        BinaryTree tree = BinaryTree.buildFromLevelOrder(new int[]{1, 2, -1, 3, 4});
        BinaryTreePrinter.printNode(tree.getRoot());
        assertThat(installCameras.minCameraCover(tree.getRoot()), is(1));
    }

    @Test
    public void minCameraCover03() {
        BinaryTree tree = BinaryTree.buildFromLevelOrder(new int[]{1, 2, 0, 0, 0});
        BinaryTreePrinter.printNode(tree.getRoot());
        assertThat(installCameras.minCameraCover(tree.getRoot()), is(2));
    }

    @Test
    public void minCameraCover04() {
        BinaryTree tree = BinaryTree.buildFromLevelOrder(new int[]{1, -1, -1});
        BinaryTreePrinter.printNode(tree.getRoot());
        assertThat(installCameras.minCameraCover(tree.getRoot()), is(1));
    }

    @Test
    public void minCameraCover05() {
        BinaryTree tree = BinaryTree.buildFromLevelOrder(new int[]{1, -1, 2, 3, -1, 4});
        BinaryTreePrinter.printNode(tree.getRoot());
        assertThat(installCameras.minCameraCover(tree.getRoot()), is(1));
    }
}

