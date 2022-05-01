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

    @Test
    public void sqrt() {
        assertThat(SquareRoot.squareRootOfNo(11), is(3));
    }

    @Test
    public void sqrt_01() {
        assertThat(SquareRoot.squareRootOfNo(64), is(8));
    }
    @Test
    public void sqrt_02() {
        assertThat(SquareRoot.squareRootOfNo(81), is(9));
    }

    @Test
    public void sqrt_1() {
        assertThat(SquareRoot.squareRootOfNo(26), is(5));
    }

    @Test
    public void sqrt_2() {
        assertThat(SquareRoot.squareRootOfNo(3), is(1));
    }
    @Test
    public void sqrt_4() {
        assertThat(SquareRoot.squareRootOfNo(4), is(2));
    }

    @Test
    public void sqrt_3() {
        assertThat(SquareRoot.squareRootOfNo(1), is(1));
    }

    @Test
    public void sqrt_large() {
        assertThat(SquareRoot.squareRootOfNo(930675566), is(30506));
    }

    @Test
    public void sqrt_0() {
        assertThat(SquareRoot.squareRootOfNo(0), is(0));
    }

}