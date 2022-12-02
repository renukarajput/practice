package edu.ren.geeks.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationTest {

    Permutation p = new Permutation();

    @Test
    public void input_1() {
        System.out.println(p.generatePermutation("ABC"));
        System.out.println(p.generatePermutation("CBAA"));
    }
    @Test
    public void input_2() {
        System.out.println(p.generatePermutation("AAB"));

    }
    @Test
    public void input_3() {
        System.out.println(p.generatePermutation("ABCA"));

    }
    @Test
    public void input_4() {
        System.out.println(p.generatePermutation("AAAA"));

    }
    @Test
    public void input_5() {
        System.out.println(p.generatePermutation("AAABBC"));
       System.out.println(new PermuteWithDuplicates().generatePermutation("AAABBC"));

    }
}