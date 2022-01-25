package edu.ren.misc.problems;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SoldierRankTest {
    SoldierRank soldierRank = new SoldierRank();

    @Test
    public void reportToSuperior() {
        int[] arr = {3,4,3,0,2,2,3,0,0};
        assertThat(soldierRank.reportToSuperior(arr), is(5));
    }
}