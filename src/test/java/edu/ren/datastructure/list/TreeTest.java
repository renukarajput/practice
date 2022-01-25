package edu.ren.datastructure.list;

import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TreeTest {

    @Test
    public void testReverseOrderTreePositiveForImage(){
        Tree<Integer> t1 = new Tree<>(10);
        t1.add(5);
        t1.add(15);
        t1.add(18);
        t1.add(20);
        t1.add(35);
        t1.inorder();
        System.out.println();

        Tree<Integer> t2 = new Tree<>(10,Collections.<Integer>reverseOrder());
        t2.add(5);
        t2.add(15);
        t2.add(18);
        t2.add(20);
        t2.add(35);
        t2.inorder();

        boolean res = t1.isMirrorTree(t2);
        assertTrue("",res);
    }

    @Test
    public void testNegativeForImage(){
        Tree<Integer> t1 = new Tree<>(10);
        t1.add(5);
        t1.add(15);
        t1.add(18);
        t1.add(20);
        t1.add(35);
        t1.inorder();
       System.out.println();

        Tree<Integer> t2 = new Tree<>(10,Collections.<Integer>reverseOrder());
        t2.add(5);
        t2.add(15);
        t2.add(4);
        t2.add(18);
        t2.add(20);
        t2.add(35);
        t2.inorder();

        boolean res = t1.isMirrorTree(t2);
        assertFalse("expected not to be Image ",res);
    }

    @Test
    public void testNegativeForMirrorImage(){
        Tree<Integer> t1 = new Tree<>(10);
        t1.add(5);
        t1.add(15);
        t1.add(18);
        t1.add(20);
        t1.add(35);
        t1.inorder();
        System.out.println();

        Tree<Integer> t2 = null;

        boolean res = t1.isMirrorTree(t2);
        assertFalse("expected not to be Image ",res);
    }
}
