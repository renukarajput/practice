package edu.ren.datastructure.interviewBit.backtracking;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AllSubsetsRecursiveTest {
AllSubsetsRecursive allSubsetsRecursive=new AllSubsetsRecursive();
    @Test
    public void subsets() {
        List<List<Integer>> subsets = allSubsetsRecursive.subsets(Arrays.asList(1, 2, 3));
        print(subsets);
    }

    protected void print(List<List<Integer>> subsets) {
        subsets.forEach(x-> System.out.println(x));
    }
}