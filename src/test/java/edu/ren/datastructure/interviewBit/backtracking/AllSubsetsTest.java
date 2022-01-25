package edu.ren.datastructure.interviewBit.backtracking;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class AllSubsetsTest {
    AllSubsets allSubsets = new AllSubsets();

    @Test
    public void subsets() {
        List<List<Integer>> subsets = allSubsets.subsets(Arrays.asList(1, 2, 3));
        print(subsets);
    }

    @Test
    public void subsets_1() {
        List<List<Integer>> subsets = allSubsets.subsets(Arrays.asList(1, 2, 3,4));
        print(subsets);

    }

    protected void print(List<List<Integer>> subsets) {
        subsets.forEach(x-> System.out.println(x));
    }

}