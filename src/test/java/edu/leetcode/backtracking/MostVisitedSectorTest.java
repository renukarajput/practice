package edu.leetcode.backtracking;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MostVisitedSectorTest {

    @Test
    public void mostVisited() {
        List<Integer> res = new MostVisitedSector().mostVisited(2, new int[]{2, 1, 2, 1, 2, 1, 2, 1, 2});
        assertThat(res, Matchers.hasItems(2));
    }



    @Test
    public void mostVisited_01() {
        List<Integer> res = new MostVisitedSector().mostVisited(7, new int[]{1,3,5,7});
        assertThat(res, Matchers.hasItems(1,2,3,4,5,6,7));
    }
}