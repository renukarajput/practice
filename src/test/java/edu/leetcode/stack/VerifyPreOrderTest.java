package edu.leetcode.stack;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class VerifyPreOrderTest {

    @Test
    public void verifyPreorder() {
      assertThat(new VerifyPreOrder().verifyPreorder(new int[]{5,2,1,3,6}),is(true));
    }

    @Test
    public void verifyPreorder_invalid() {
        assertThat(new VerifyPreOrder().verifyPreorder(new int[]{5,2,6,1,3}),is(false));
    }

    @Test
    public void verifyPreorder_1() {
        assertThat(new VerifyPreOrder().verifyPreorder(new int[]{5,2,12,4}),is(false));
    }

    @Test
    public void verifyPreorder_2() {
        assertThat(new VerifyPreOrder().verifyPreorder(new int[]{5,2,12,8,6,9}),is(true));
    }


    @Test
    public void verifyPreorder_3() {
        assertThat(new VerifyPreOrder().verifyPreorder(new int[]{5,12,18,28,6}),is(false));
    }

    @Test
    public void verifyPreorder_4() {
        assertThat(new VerifyPreOrder().verifyPreorder(new int[]{5,12,18,28,19}),is(true));
    }


    @Test
    public void verifyPreorder_5() {
        assertThat(new VerifyPreOrder().verifyPreorder(new int[]{2,4,3,1}),is(false));
    }


    @Test
    public void verifyPreorder_6() {
        assertThat(new VerifyPreOrder().verifyPreorder(new int[]{80,75,13,1,90}),is(true));
    }


    @Test
    public void verifyPreorder_7() {
        assertThat(new VerifyPreOrder().verifyPreorder(new int[]{6,4,1,2,5,3}),is(false));
    }
}