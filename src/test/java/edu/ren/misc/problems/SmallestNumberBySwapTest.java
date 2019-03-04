package edu.ren.misc.problems;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SmallestNumberBySwapTest {
    SmallestNumberBySwap smallestNumberBySwap=new SmallestNumberBySwap();

    @Test
    public void nextSmaller() {
        final String s = smallestNumberBySwap.nextSmallest("9625635");
       assertThat(s,is("2695635"));
        System.out.println(s);
    }
    @Test
    public void nextSmaller_1() {
        final String s = smallestNumberBySwap.nextSmallest("1215763");
        assertThat(s,is("1125763"));

        System.out.println(s);
    }
    @Test
    public void nextSmaller_2() {
        final String s = smallestNumberBySwap.nextSmallest("1121");
        assertThat(s,is("1112"));

        System.out.println(s);
    }  @Test
    public void nextSmaller_3() {
        final String s = smallestNumberBySwap.nextSmallest("2223");
        assertThat(s,is("2223"));

        System.out.println(s);
    } @Test
    public void nextSmaller_4() {
        final String s = smallestNumberBySwap.nextSmallest("81111112");
        assertThat(s,is("11111182"));

        System.out.println(s);
    }
}