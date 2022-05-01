package edu.leetcode.misc;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MinimisedMaximumTest {
MinimisedMaximum minimisedMaximum= getMinimisedMaximum();

    protected MinimisedMaximum getMinimisedMaximum() {
        return new MinimisedMaximum();
    }

    /**15 10 10
n=7 ,l=5
10 10 15 _ _ _ _
10 10 5 5 5 _ _
5 5 5 5 5 5 5
 */

    @Test
    public void minimizedMaximum() {
      assertThat(minimisedMaximum.minimizedMaximum(7,new int[]{15,10,10}),is(5));
    }

    /**
     * 15 10 11
     * n=7 ,l=6
     * 10 11 15 _ _ _ _
     * 6 6 3 _6  6_5 _4 _
     *
     */
    @Test
    public void minimizedMaximum0() {
        assertThat(minimisedMaximum.minimizedMaximum(7,new int[]{15,10,11}),is(6));
    }

    @Test
    public void minimizedMaximum00() {
        assertThat(minimisedMaximum.minimizedMaximum(11,new int[]{15,10,11,18,17,25,32,16,27}),is(25));
    }


    @Test
    public void minimizedMaximum_01() {
        assertThat(minimisedMaximum.minimizedMaximum(1,new int[]{1000}),is(1000));
    }
    @Test
    public void minimizedMaximum_02() {
        assertThat(minimisedMaximum.minimizedMaximum(3,new int[]{1000}),is(334));
    }
}