package edu.ren.misc.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class PatternPrintingTest {

    PatternPrinting pp = new PatternPrinting();

    @Test
    public void input_1() {
        pp.printPyramid(3);
    }

    @Test
    public void input_2() {
        pp.printPyramid(4);
    }

    @Test
    public void input_3() {
        pp.printPyramidFromLeft(3);
    }

    @Test
    public void input_4() {
        pp.printPyramidFromLeft(4);
    }

    @Test
    public void input_5() {
        pp.printTriangle(4);
    }
}