package edu.ren.geeks.string;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MinimumSwapsTest {
    MinimumSwaps minimumSwaps = new MinimumSwaps();

    @Test
    public void input_1() {
        int actual[] = {3, 1, 5, 3, 5, 5, 2};
        int minimumAdjacentSwaps = minimumSwaps.getMinimumAdjacentSwaps(actual);
        assertThat(minimumAdjacentSwaps, is(5));
    }

    @Test
    public void input_2() {
        int actual[] = {5, 6, 1, 3};
        int minimumAdjacentSwaps = minimumSwaps.getMinimumAdjacentSwaps(actual);
        assertThat(minimumAdjacentSwaps, is(2));
    }

    @Test
    public void input_3() {
        int actual[] = {5, 4, 1, 3};
        int minimumAdjacentSwaps = minimumSwaps.getMinimumAdjacentSwaps(actual);
        assertThat(minimumAdjacentSwaps, is(1));
    }

    @Test
    public void input_4() {
        int actual[] = {5, 6, 7, 8, 3, 1, 2, 4};
        int minimumAdjacentSwaps = minimumSwaps.getMinimumAdjacentSwaps(actual);
        assertThat(minimumAdjacentSwaps, is(1));
    }

}