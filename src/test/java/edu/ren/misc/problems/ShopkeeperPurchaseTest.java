package edu.ren.misc.problems;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ShopkeeperPurchaseTest {

    ShopkeeperPurchase sp = new ShopkeeperPurchase();

    @Test
    public void canSell_1() {
        int[] ints = {5, 15};
        int out = sp.canSell(ints);
        assertThat(out, is(2));
    }

    @Test
    public void canSell_2() {
        int[] ints = {5, 10, 15, 20};
        int out = sp.canSell(ints);
        assertThat(out, is(0));
    }

    @Test
    public void canSell_3() {
        int[] ints = {5, 5, 5, 5, 5, 10};
        int out = sp.canSell(ints);
        assertThat(out, is(0));
    }

    @Test
    public void canSell_4() {
        int[] ints = {5, 5, 10, 5, 10, 10};
        int out = sp.canSell(ints);
        assertThat(out, is(0));
    }

    @Test
    public void canSell_5() {
        int[] ints = {5, 5, 10, 5, 30};
        int out = sp.canSell(ints);
        assertThat(out, is(5));
    }

    @Test
    public void canSell_6() {
        int[] ints = {50, 5};
        int out = sp.canSell(ints);
        assertThat(out, is(1));
    }
}