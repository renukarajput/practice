package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BallInFullTreeTest {

    @Test
    public void leafNumber_h1() {
        assertThat(BallInFullTree.leafNumber(1,1),is(2));
        assertThat(BallInFullTree.leafNumber(1,2),is(3));
    }

    @Test
    public void leafNumber_h2() {
        assertThat(BallInFullTree.leafNumber(2,1),is(4));
        assertThat(BallInFullTree.leafNumber(2,2),is(6));
        assertThat(BallInFullTree.leafNumber(2,3),is(5));
        assertThat(BallInFullTree.leafNumber(2,4),is(7));
        assertThat(BallInFullTree.leafNumber(2,5),is(4));
    }

    @Test
    public void leafNumber_h3() {
        System.out.println(BallInFullTree.leafNumber(3,1));
        System.out.println(BallInFullTree.leafNumber(3,2));
        System.out.println(BallInFullTree.leafNumber(3,3));
        System.out.println(BallInFullTree.leafNumber(3,4));
        System.out.println(BallInFullTree.leafNumber(3,5));
        System.out.println(BallInFullTree.leafNumber(3,6));
        System.out.println(BallInFullTree.leafNumber(3,7));
        System.out.println(BallInFullTree.leafNumber(3,8));
        System.out.println(BallInFullTree.leafNumber(3,9));
    }
}