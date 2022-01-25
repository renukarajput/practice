package edu.leetcode.unionfind;

import static org.junit.Assert.*;

public class IslandNumbersUnionFindTest extends IslandNumbersTest{

    @Override
    protected IslandNumbers getIslandNumbers() {
      return new IslandNumbersUnionFind();
    }
}