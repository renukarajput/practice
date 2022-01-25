package edu.ren.geeks.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationTest {

    Permutation p = new Permutation();

    @Test
    public void input_1() {
        p.allPossiblePermutation("abc");
    }
}