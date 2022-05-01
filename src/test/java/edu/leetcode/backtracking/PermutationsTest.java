package edu.leetcode.backtracking;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PermutationsTest {
Permutations permutations=new Permutations();

    @Test
    public void permute() {
        List<List<Integer>> permute = permutations.permute(new int[]{1, 2, 3});
       assertThat(permute.toString(),
               is("[[3, 1, 2], [3, 2, 1], [1, 2, 3], [1, 3, 2], [1, 3, 2], [1, 2, 3]]"));
    }

    @Test
    public void permute_01() {
        List<List<Integer>> permute = permutations.permute(new int[]{0, 1});
        assertThat(permute.toString(),
                is("[[1, 0], [0, 1]]"));
    }
}