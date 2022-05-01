package edu.ren.hackerrank.medium;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class NewYearChaosTest {
    NewYearChaos newYearChaos=new NewYearChaos();

    @Test
    public void getBribe() {
        int[] arr={2,1,5,3,4};
       assertThat(newYearChaos.getMinimumBribe(arr),is(3));
    }

    @Test
    public void getBribe_1() {
        int[] arr={2,5,1,3,4};
       assertThat(newYearChaos.getMinimumBribe(arr),is(-1));
    }
// 1 2 3 4 5 6 7 8
// 1 2 5 3 4 6 7 8  // 5 gave 2 bribes
//1 2 5 3 7 4 6 8  // 7 gave 2 bribes
//1 2 5 3 7 8 4 6 //8 gave 2 bribes
//1 2 5 3 7 8 6 4 //6 gave 1 bribe
//3 + 1 +1 +
    @Test
    public void getBribe_2() {
        int[] arr = {1, 2, 5, 3, 7, 8, 6, 4};
        assertThat(newYearChaos.getMinimumBribe(arr),is(7));

    }

    @Test
    public void getBribe_3() {
        int[] arr = {1, 2, 5, 3, 7, 4, 6, 8};
        assertThat(newYearChaos.getMinimumBribe(arr),is(4));

    }
}