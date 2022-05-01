package com.scratch;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DeviceAllocationTest {
DeviceAllocation deviceAllocation=new DeviceAllocation();
    @Test
    public void optimalUtilization() {
        List<List<Integer>> foreGround=new ArrayList<>();
        foreGround.add(Arrays.asList(new Integer[]{1,3}));
        foreGround.add(Arrays.asList(new Integer[]{2,5}));
        foreGround.add(Arrays.asList(new Integer[]{3,7}));
        foreGround.add(Arrays.asList(new Integer[]{4,10}));

        List<List<Integer>> foreGround1=new ArrayList<>();
        foreGround1.add(Arrays.asList(new Integer[]{1,2}));
        foreGround1.add(Arrays.asList(new Integer[]{2,3}));
        foreGround1.add(Arrays.asList(new Integer[]{3,4}));
        foreGround1.add(Arrays.asList(new Integer[]{4,5}));
        final List<List<Integer>> res = deviceAllocation.optimalUtilization(10, foreGround, foreGround1);
        System.out.println(res);
    }

    @Test
    public void optimalUtilization1() {
        List<List<Integer>> foreGround=new ArrayList<>();
        foreGround.add(Arrays.asList(new Integer[]{1,8}));
        foreGround.add(Arrays.asList(new Integer[]{2,7}));
        foreGround.add(Arrays.asList(new Integer[]{3,14}));

        List<List<Integer>> foreGround1=new ArrayList<>();
        foreGround1.add(Arrays.asList(new Integer[]{1,5}));
        foreGround1.add(Arrays.asList(new Integer[]{2,10}));
        foreGround1.add(Arrays.asList(new Integer[]{3,14}));
        final List<List<Integer>> res = deviceAllocation.optimalUtilization(20, foreGround, foreGround1);
        System.out.println(res);
    }
    @Test
    public void optimalUtilization2() {
        List<List<Integer>> foreGround=new ArrayList<>();
        foreGround.add(Arrays.asList(new Integer[]{1,8}));
        foreGround.add(Arrays.asList(new Integer[]{2,15}));
        foreGround.add(Arrays.asList(new Integer[]{3,9}));

        List<List<Integer>> foreGround1=new ArrayList<>();
        foreGround1.add(Arrays.asList(new Integer[]{1,8}));
        foreGround1.add(Arrays.asList(new Integer[]{2,11}));
        foreGround1.add(Arrays.asList(new Integer[]{3,12}));
        final List<List<Integer>> res = deviceAllocation.optimalUtilization(20, foreGround, foreGround1);
        System.out.println(res);
    }
}