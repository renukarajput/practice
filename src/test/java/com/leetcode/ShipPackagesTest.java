package com.leetcode;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ShipPackagesTest {
    ShipPackages obj = new ShipPackages();

    @Test
    public void shipWithinDays() {
        assertThat(obj.shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 15), is(5));
    }

    @Test
    public void shipWithinDays1() {
        assertThat(obj.shipWithinDays(new int[]{2, 4, 1}, 5), is(2));
    }

    @Test
    public void shipWithinDays2() {
        assertThat(obj.shipWithinDays(new int[]{4, 4, 1}, 3), is(-1));
    }
}