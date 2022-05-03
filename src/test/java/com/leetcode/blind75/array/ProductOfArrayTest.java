package com.leetcode.blind75.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ProductOfArrayTest {
    ProductOfArray obj = getProductOfArray();

    protected ProductOfArray getProductOfArray() {
        return new ProductOfArray();
    }

    @Test
    public void testProductExceptSelf_0() {
        int[] nums = {1,2,3};
        assertThat(obj.productExceptSelf(nums), is(new int[]{6,3,2}));
    }
    @Test
    public void testProductExceptSelf() {
        int[] nums = {1,2,3,4};
        assertThat(obj.productExceptSelf(nums), is(new int[]{24, 12, 8, 6}));
    }

    @Test
    public void testProductExceptSelf_1() {
        int[] nums = {-1,1,0,-3,3};
        assertThat(obj.productExceptSelf(nums), is(new int[]{0, 0, 9, 0, 0}));
    }
    @Test
    public void testProductExceptSelfElm() {
        assertThat(obj.productExceptSelfElm(new int[]{1,2,3}), is(new int[]{6,3,2}));
        assertThat(obj.productExceptSelfElm(new int[]{1,2,3,4}), is(new int[]{24,12,8,6}));
        assertThat(obj.productExceptSelfElm(new int[]{-1,1,0,-3,3}), is(new int[]{0, 0, 9, 0, 0}));
    }
}