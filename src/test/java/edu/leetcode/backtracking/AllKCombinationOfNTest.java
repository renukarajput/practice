package edu.leetcode.backtracking;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class AllKCombinationOfNTest {

    private AllKCombinationOfN allKCombinationOfN= new AllKCombinationOfN();;

    @Test
    public void combine() {

        assertThat(allKCombinationOfN.combine(4,2).toString(),
                is("[[1, 2], [1, 3], [1, 4], [2, 3], [2, 4], [3, 4]]"));
    }


    @Test
    public void combine_01() {

        assertThat(allKCombinationOfN.combine(1,1).toString(),
                is("[[1]]"));
    }
}