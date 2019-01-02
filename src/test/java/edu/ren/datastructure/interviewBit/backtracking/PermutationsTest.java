package edu.ren.datastructure.interviewBit.backtracking;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PermutationsTest {

    Permutations permutations = new Permutations();

    @Test
    public void permute() {
        ArrayList<ArrayList<Integer>> permute = permutations.permute(new ArrayList<>(Arrays.asList(1, 2, 3)));
        String expected = "[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 2, 1], [3, 1, 2]]";
        assertThat(permute.toString(), is(expected));
        permute.forEach(p -> System.out.println(p));
    }
}