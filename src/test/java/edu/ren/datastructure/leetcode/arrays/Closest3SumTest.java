package edu.ren.datastructure.leetcode.arrays;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class Closest3SumTest {
    Closest3Sum closest3Sum=new Closest3Sum();

    @Test
    public void threeSumClosest() {
        int[] nums={-1,2,1,-4};
       assertThat(closest3Sum.threeSumClosest(nums,1),is(2));
    }

    @Test
    public void threeSumClosest01() {
        int[] nums={0,0,0};
        assertThat(closest3Sum.threeSumClosest(nums,1),is(0));
    }

    @Test
    public void threeSumClosest02() {
        int[] nums={-3,-2,-5,3,-4};
        assertThat(closest3Sum.threeSumClosest(nums,-1),is(-2));
    }


    @Test
    public void threeSumClosest03() {
        int[] nums={-4,-7,-2,2,5,-2,1,9,3,9,4,9,-9,-3,7,4,1,0,8,5,-7,-7};
        assertThat(closest3Sum.threeSumClosest(nums,29),is(27));
    }


    @Test
    public void binarySearchClosest() {
        int[] nums={1,4,9,10};
      int res=closest3Sum.binarySearchClosest(nums,7,0,4);
      assertThat(nums[res],is(9));
    }

    @Test
    public void binarySearchClosest01() {
        int[] nums={-1,2,1,-4};
        int res=closest3Sum.binarySearchClosest(nums,1,0,4);
        assertThat(nums[res],is(1));
    }

    @Test
    public void binarySearchClosest02() {
        int[] nums={-3,-2,-5,3,-4};
        int res=closest3Sum.binarySearchClosest(nums,4,0,4);
        assertThat(nums[res],is(3));
    }

}