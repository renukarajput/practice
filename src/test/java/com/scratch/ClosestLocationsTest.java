package com.scratch;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ClosestLocationsTest {
ClosestLocations closestLocations=new ClosestLocations();
    @Test
    public void closestXdestinations() {
        List<List<Integer>> alloc=new ArrayList<>();
        alloc.add(Arrays.asList(new Integer[]{1,2}));
        alloc.add(Arrays.asList(new Integer[]{3,4}));
        alloc.add(Arrays.asList(new Integer[]{1,-1}));
        final List<List<Integer>> res = closestLocations.ClosestXdestinations(3, alloc, 2);
        System.out.println(res);
    }
}