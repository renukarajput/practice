package edu.ren.datastructure.interviewBit.backtracking;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CombinationsTest {
Combinations combinations=new Combinations();
    @Test
    public void combination() {
        ArrayList<ArrayList<Integer>> combination = combinations.combination(4, 2);
        System.out.println(combination);
    }


@Test
    public void combination_1() {
        ArrayList<ArrayList<Integer>> combination = combinations.combination(5, 3);
        combination.forEach(c-> System.out.println(c));
    }
}