package edu.leetcode.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MinSwapsContiniousOnesTest {

    @Test
    public void minSwaps() {
       int res= new MinSwapsContiniousOnes().minSwaps(new int[]{1,0,1,0,1,0,0,1,1,0,1});
        System.out.println(res);
        assertThat(res,is(3));
    }

    @Test
    public void minSwaps_1() {
       int res= new MinSwapsContiniousOnes().minSwaps(new int[]{0,0,0,1,0});
        System.out.println(res);
        assertThat(res,is(0));
    }

    @Test
    public void minSwaps_2() {
       int res= new MinSwapsContiniousOnes().minSwaps(new int[]{1,0,1,0,1});
        System.out.println(res);
        assertThat(res,is(1));
    }

    @Test
    public void minSwaps_3() {
       int res= new MinSwapsContiniousOnes().minSwaps(new int[]{1,0,1,0,1,0,1,1,1,0,1,0,0,1,1,1,0,0,1,1,1,0,1,0,1,1,0,0,0,1,1,1,1,0,0,1});
        System.out.println(res);
        assertThat(res,is(8));
    }
}