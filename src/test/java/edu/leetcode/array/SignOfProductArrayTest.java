package edu.leetcode.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SignOfProductArrayTest {
    SignOfProductArray obj = new SignOfProductArray();

    @Test
    public void test(){
        assertThat(obj.arraySign(new int[]{-1,-2,-3,-4,3,2,1}), is(1));
        assertThat(obj.arraySign(new int[]{-1,1,-1,1,-1}), is(-1));
        assertThat(obj.arraySign(new int[]{1,5,0,2,-3}), is(0));
        assertThat(obj.arraySign(new int[]{41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41}), is(-1));

    }
}