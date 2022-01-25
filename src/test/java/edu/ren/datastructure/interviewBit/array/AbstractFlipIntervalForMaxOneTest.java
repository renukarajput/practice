package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public abstract class AbstractFlipIntervalForMaxOneTest {
    protected abstract Flip getFlipper();

    @Test
    public void flip() {
        List<Integer> flip = getFlipper().flip("0011001110001000");
        System.out.println(flip);
        assertThat(flip.toString(), is("[10, 16]"));
    }

    @Test
    public void flip_0() {
        List<Integer> flip = getFlipper().flip("010");
        System.out.println(flip);
        assertThat(flip.toString(), is("[1, 1]"));
    }


    @Test
    public void flip_1() {
        List<Integer> flip = getFlipper().flip("00100");
        System.out.println(flip);
        assertThat(flip.toString(), is("[1, 5]"));
    }

    @Test
    public void flip_2() {
        List<Integer> flip = getFlipper().flip("001001100");
        System.out.println(flip);
        assertThat(flip.toString(), is("[1, 5]"));
    }

    @Test
    public void flip_3() {
        List<Integer> flip = getFlipper().flip("0011000100010");
        System.out.println(flip);
        assertThat(flip.toString(), is("[1, 11]"));
    }


    @Test
    public void flip_4() {
        List<Integer> flip = getFlipper().flip("111110001110001");
        System.out.println(flip);
        assertThat(flip.toString(), is("[6, 8]"));
    }

    @Test
    public void flip_5() {
        List<Integer> flip = getFlipper().flip("111");
        System.out.println(flip);
        assertThat(flip.toString(), is("[]"));
    }

}
