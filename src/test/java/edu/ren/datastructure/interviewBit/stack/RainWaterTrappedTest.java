package edu.ren.datastructure.interviewBit.stack;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class RainWaterTrappedTest {
RainWaterTrapped rainWaterTrapped=new RainWaterTrapped();

    @Test
    public void getAmount() {
        Integer[] bars={0,1,0,2,1,0,1,3,2,1,2,1};
        assertThat(rainWaterTrapped.getAmount(bars),is(6));
    }

    @Test
    public void getAmount_01() {
        Integer[] bars={0,1,0,2,1,0,1,3};
        assertThat(rainWaterTrapped.getAmount(bars),is(5));
    }

    @Test
    public void getAmount_02() {
        Integer[] bars={0,1,0,2,1,0,1,3};
        assertThat(rainWaterTrapped.getAmount(bars),is(5));
    }

    @Test
    public void getAmount_zero() {
        Integer[] bars={1,2,3};
        assertThat(rainWaterTrapped.getAmount(bars),is(0));
    }

    @Test
    public void getAmount_1() {
        Integer[] bars={1,2,3,0,1};
        assertThat(rainWaterTrapped.getAmount(bars),is(1));
    }

    @Test
    public void getAmount_12() {
        Integer[] bars={1,0,2,0,1,0,3,0,1,0,2};
        assertThat(rainWaterTrapped.getAmount(bars),is(11));
    }

    @Test
    public void getAmount_13() {
        Integer[] bars= {3, 0, 0, 2, 0, 4};
        assertThat(rainWaterTrapped.getAmount(bars),is(10));
    }

    @Test
    public void getAmount_14() {
        Integer[] bars= {2, 0, 2};
        assertThat(rainWaterTrapped.getAmount(bars),is(2));
    }
}