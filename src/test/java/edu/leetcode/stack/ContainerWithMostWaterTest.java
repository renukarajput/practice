package edu.leetcode.stack;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {
ContainerWithMostWater containerWithMostWater=new ContainerWithMostWater();
    @org.junit.Test
    public void trap() {
       assertThat(containerWithMostWater.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}),is(6));
    }

    @org.junit.Test
    public void trap01() {
        assertThat(containerWithMostWater.trap(new int[]{4,2,0,3,2,5}),is(9));
    }

    @org.junit.Test
    public void trap02() {
        assertThat(containerWithMostWater.trap(new int[]{5,4,1,2}),is(1));
    }
}