package edu.ren.geeks.array;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SquareRootTest {
    @Test
    public void squareRootOfNo_1() {
        int output = SquareRoot.squareRootOfNo(36);
        assertThat(output, is(6));
    }

    @Test
    public void squareRootOfNo_2() {
        int output = SquareRoot.squareRootOfNo(81);
        assertThat(output, is(9));
    }

    @Test
    public void squareRootOfNo_3() {
        int output = SquareRoot.squareRootOfNo(100);
        assertThat(output, is(10));
    }

    @Test
    public void squareRootOfNo_4() {
        int output = SquareRoot.squareRootOfNo(25);
        assertThat(output, is(5));
    }

    @Test
    public void squareRoot_5() {
        int output = SquareRoot.squareRoot(25);
        assertThat(output, is(5));
    }

}