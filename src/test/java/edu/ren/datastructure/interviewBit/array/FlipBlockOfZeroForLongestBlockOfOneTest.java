package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FlipBlockOfZeroForLongestBlockOfOneTest {

    @Test
    public void flip() {
        int[] arr={010};
        List<Integer> flip = new FlipBlockOfZeroForLongestBlockOfOne().flip("010");
        System.out.println(flip);
        assertThat(flip.toString(),is("[1, 1]"));

        //System.out.println(Arrays.toString(flip));
    }

    @Test
    public void flip_0() {
        int[] arr={010111};
        List<Integer> flip = new FlipBlockOfZeroForLongestBlockOfOne().flip("010111");
        System.out.println(flip);
        assertThat(flip.toString(),is("[1, 1]"));

        //System.out.println(Arrays.toString(flip));
    }

    @Test
    public void flip_1() {
        int[] arr={000110000};
        List<Integer> flip = new FlipBlockOfZeroForLongestBlockOfOne().flip("000110000");
       // System.out.println(Arrays.toString(flip));
        System.out.println(flip);
        assertThat(flip.toString(),is("[4, 9]"));

    }



    @Test
    public void flip_2() {
        int[] arr={000110000111};
        List<Integer> flip = new FlipBlockOfZeroForLongestBlockOfOne().flip("000110000111");
        System.out.println(flip);
        assertThat(flip.toString(),is("[6, 9]"));

        // System.out.println(Arrays.toString(flip));
    }

    @Test
    public void flip_3() {
        int[] arr={00011000011111};
        List<Integer> flip = new FlipBlockOfZeroForLongestBlockOfOne().flip("00011000011111");
       // System.out.println(Arrays.toString(flip));
        System.out.println(flip);

    }

    @Test
    public void flip_4() {
        List<Integer> flip = new FlipBlockOfZeroForLongestBlockOfOne().flip("00011000011000000");
       // System.out.println(Arrays.toString(flip));
        System.out.println(flip);

    }

    @Test
    public void flip_5() {
        List<Integer> flip = new FlipBlockOfZeroForLongestBlockOfOne().flip("000");
        System.out.println(flip);
       // System.out.println(Arrays.toString(flip));
    }
}