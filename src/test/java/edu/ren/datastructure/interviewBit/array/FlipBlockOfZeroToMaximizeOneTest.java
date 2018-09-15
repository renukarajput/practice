package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FlipBlockOfZeroToMaximizeOneTest {

    @Test
    public void flip() {
        List<Integer> flip = new FlipBlockOfZeroToMaximizeOne().flip("010");
        System.out.println(flip);
        assertThat(flip.toString(), is("[1, 1]"));
    }

    @Test
    public void flip_0() {
        List<Integer> flip = new FlipBlockOfZeroToMaximizeOne().flip("010111");
        System.out.println(flip);
        assertThat(flip.toString(), is("[1, 1]"));
    }

    @Test
    public void flip_1() {
        List<Integer> flip = new FlipBlockOfZeroToMaximizeOne().flip("001001110001000");
        System.out.println(flip);
        assertThat(flip.toString(), is("[9, 11]"));
    }
}
